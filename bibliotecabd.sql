-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: mysql-container:3306
-- Tiempo de generación: 27-09-2024 a las 04:05:42
-- Versión del servidor: 8.4.0
-- Versión de PHP: 8.2.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bibliotecabd`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `autor`
--

CREATE TABLE `autor` (
  `id` int NOT NULL,
  `nombre` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `autor`
--

INSERT INTO `autor` (`id`, `nombre`) VALUES
(1, 'Rebecca Yarros'),
(2, 'C.S. LEWIS'),
(3, 'GABRIEL GARCIA MARQUEZ'),
(4, 'MARK MANSON'),
(5, 'GABRIEL ROLÓN'),
(6, 'ANA GARCIA'),
(7, 'VENIO TACHIBANA; RIHITO TAKARAI'),
(8, 'REBECCA ROSS');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `comentarios`
--

CREATE TABLE `comentarios` (
  `id` int NOT NULL,
  `contenido` text NOT NULL,
  `id_user` int NOT NULL,
  `id_book` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `comentarios`
--

INSERT INTO `comentarios` (`id`, `contenido`, `id_user`, `id_book`) VALUES
(1, 'no entiendo ni madres', 11, 7),
(2, 'Hay mejores.', 12, 7),
(3, 'mejor me retiro de la carrera xd', 11, 7),
(10, 'hola', 12, 8),
(11, 'o si por fin se pudo', 12, 8),
(12, 'o si por fin se pudo jajajajaja', 12, 8),
(18, 'genial', 12, 3),
(19, 'que estafa :(', 12, 4),
(20, 'zzzz', 11, 2),
(21, 'cxcsds', 12, 7),
(22, 'algo', 16, 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `donacion`
--

CREATE TABLE `donacion` (
  `id` int NOT NULL,
  `who` varchar(70) NOT NULL,
  `id_book` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `editorial`
--

CREATE TABLE `editorial` (
  `id` int NOT NULL,
  `nombre` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `editorial`
--

INSERT INTO `editorial` (`id`, `nombre`) VALUES
(1, 'PLANETA'),
(2, 'GRUPO NELSON'),
(3, 'RANDOM HOUSE'),
(4, 'HARPER COLLINS'),
(5, 'PLANETA'),
(6, 'GRUPO EDITORIAL PATRIA'),
(7, 'TOMODOMO'),
(8, 'PUCK');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `libro`
--

CREATE TABLE `libro` (
  `id` int NOT NULL,
  `titulo` varchar(50) NOT NULL,
  `sinopsis` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `url_image` varchar(50) NOT NULL,
  `isbn` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `anio_publicacion` varchar(5) NOT NULL,
  `total_ejemplares` int NOT NULL,
  `disponibles` int NOT NULL DEFAULT '0',
  `donador` varchar(100) DEFAULT NULL,
  `id_author` int NOT NULL,
  `id_editorial` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `libro`
--

INSERT INTO `libro` (`id`, `titulo`, `sinopsis`, `url_image`, `isbn`, `anio_publicacion`, `total_ejemplares`, `disponibles`, `donador`, `id_author`, `id_editorial`) VALUES
(1, 'ALAS DE SANGRE (EMPIREO 1)', 'Violet Sorrengail creía que se uniría al Cuadrante de los Escribas para vivir una vida tranquila, sin embargo, por órdenes de su madre, debe unirse a los miles de candidatos que, en el Colegio de Guerra de Basgiath, luchan por formar parte de la élite de Navarre: el Cuadrante de los Jinetes de dragones. Cuando eres más pequeña y frágil que los demás tu vida corre peligro, porque los dragones no se vinculan con humanos débiles. Además, con más jinetes que dragones disponibles, muchos la matarían con tal de mejorar sus probabilidades de éxito; y hay otros, como el despiadado Xaden Riorson, el líder de ala más poderoso del Cuadrante de Jinetes, que la asesinarían simplemente por ser la hija de la comandante general...', '/booksImages/9786123198640.jpg', '9786123198640', '2003', 10, 10, NULL, 1, 1),
(2, 'CRONICAS DE NARNIA', 'Bestias parlantes, hazañas heroicas y batallas épicas entre el bien y el mal te esperan en la clásica serie fantástica de C. S. Lewis, que lleva más de sesenta años encantando a los lectores. Esta edición presenta los siete libros sin resumir según el orden preferido de Lewis, y cada capítulo está adornado con una ilustración de la artista original, Pauline Baynes. Además, contiene el ensayo de C. S. Lewis “Sobre tres formas de escribir para niños”, en el que explica con precisión cómo la magia de Narnia y el reino de la fantasía atraen no sólo a los niños, sino a lectores exigentes de todas las edades.', '/booksImages/9781400334780.jpg', '9781400334780', '2023', 21, 18, NULL, 2, 2),
(3, 'EN AGOSTO NOS VEMOS', 'Cada mes de agosto Ana Magdalena Bach toma el transbordador hasta la isla donde está enterrada su madre para visitar la tumba en la que yace. Esas visitas acaban suponiendo una irresistible invitación a convertirse en una persona distinta durante una noche al año. Escrita en el inconfundible y fascinante estilo de García Márquez, En agosto nos vemos es un canto a la vida, a la resistencia del goce pese al paso del tiempo y al deseo femenino. Un regalo inesperado para los innumerables lectores del Nobel colombiano.', '/booksImages/9786287638358.jpg', '9786287638358', '2024', 9, 6, NULL, 3, 3),
(4, 'EL SUTIL ARTE DE QUE TE IMPORTE UN CARAJ*', 'Durante los últimos años, Mark Manson -en su popular blog- se ha afanado en corregir nuestras delirantes expectativas sobre nosotros mismos y el mundo. Ahora nos ofrece su toda su intrépida sabiduría en este libro pionero. Manson nos recuerda que los seres humanos somos falibles y limitados: «no todos podemos ser extraordinarios: hay ganadores y perdedores en la sociedad, y esto no siempre es justo o es tu culpa». Manson nos aconseja que reconozcamos nuestras limitaciones y las aceptemos. Esto es, según él, el verdadero origen del empoderamiento. Una vez que abrazamos nuestros temores, faltas e incertidumbres, una vez que dejamos de huir y evadir y empezamos a confrontar las verdades dolorosas, podemos comenzar a encontrar el valor, la perseverancia, la honestidad, la responsabilidad, la curiosidad y el perdón que buscamos. Este manifiesto es una refrescante bofetada, para que podamos empezar a llevar vidas más satisfechas y con los pies en la tierra.', '/booksImages/9781404117150.jpg', '9781404117150', '2018', 4, 4, NULL, 4, 4),
(5, 'FIVE NIGHTS AT FREDDY\'S: EL JUEGO DE LALLY', 'Estas tres terroríficas historias son suficientes para inquietar incluso a los más valientes y temerarios. Si eres fan de Five Nights at Freddy\'s no querrás perderte esta nueva entrega de la serie que te mantendrá despierto toda la noche. Un artefacto prohibido ha llamado irresistiblemente la atención de Selena. Jessica lleva una doble vida lejos de sus amigos y compañeros en el ala de pediatría del hospital. Maya no puede resistir la tentación de explorar el área prohibida del Mega Pizzaplex de Freddy. Pero en el retorcido mundo de Five Night at Freddy\'s todo conlleva un costo inesperado...Algunos secretos están mejor guardados.', '/booksImages/9786125125064.jpg', '9786125125064', '2024', 3, 3, NULL, 2, 2),
(6, 'EL DUELO', '“El Duelo es un territorio oscuro, misterioso, casi inaccesible. Una conmoción que nos sorprende, nos toma desprevenidos y cambia nuestro entorno en un instante. No importa lo preparados que creamos estar para enfrentar una pérdida, esa preparación jamás será suficiente. Cuando ocurre, todo se desmorona y por un tiempo nada tiene sentido. Algo se quiebra en nosotros, el mundo se derrumba y nos muestra su aspecto más cruel.” Con estas palabras describe Gabriel Rolón cuál será el camino a transitar en su nuevo ensayo: la pérdida. Sí, la muerte, sin rodeos (la propia, y la de los que amamos), pero también la falta imprevista (o no tanto) de todo aquello que nos sostiene anclados a la vida. La pérdida de un trabajo, una pareja, un hogar, el reconocimiento de un otro y hasta la juventud nos empujan al duelo. Y es ahí, en ese soplo en el que el dolor se hace carne y la pena se devora las palabras, que Gabriel Rolón comparte su reflexión aguda, certera, siempre lúcida. Por eso, su nuevo libro se nutre de mitología y de música, de cine y literatura, de casos clínicos y teoría analítica. Porque es una mirada que indaga en el padecimiento y a la vez en los mecanismos que el Psicoanálisis como disciplina, y que el arte como forma de entender el mundo, nos tienden a modo de puentes para superar lo ausente. Y es que el Duelo –y en esto Rolón es tan claro como firme– es una “guerra” íntima. Una prueba, tal vez la más dura, que nos pone cara a cara con lo que perdimos y con lo que podemos crear a partir de lo perdido. Una batalla salvaje que nos transforma de una vez y para siempre. Y que en su impiadosa deriva nos lleva hacia un renacer que nos hace más humanos. Solo el que ama la vida, piensa en la muerte', '/booksImages/9786123196639.jpg', '9786123196639', '2024', 0, 0, NULL, 5, 5),
(7, 'CALCULO DE VARIAS VARIABLES', 'En sus páginas, Cálculo de varias variables se abordan a detalle los principales temas de cálculo vectorial. Este texto, integrado por cuatro unidades, pretende convertirse en una herramienta de aprendizaje, muy útil e imprescindible para los estudiantes de ingeniería que tengan alguna complicación para entender los problemas de cálculo de varias variables. Entre otros aspectos contiene una diversidad de problemas resueltos, más de 50, los cuales muestran, paso a paso, los cálculos necesarios para llegar a una solución. Algo muy importante es que presenta y desarrolla de manera sencilla y clara los temas y conceptos teóricos necesarios para mejorar su comprensión.', '/booksImages/9786074386448.jpg', '9786074386448', '2013', 1, 1, NULL, 6, 6),
(8, 'SEVEN DAYS, VOL. 2', 'Tôji Seryô es conocido en el instituto por aceptar salir con quien primero se lo pide cada lunes, sea quien sea, e inevitablemente cortar con esa persona cuando la semana llega a su fin. Después de declarársele, Yuzuru se convierte en su ligue semanal. Aquel primer día empiezan a salir, pero hasta el martes no toman conciencia de lo que significa; el miércoles comienzan a estrechar lazos, el jueves, se dan cuenta de que están enamorados… ¿Qué les depararán los restantes tres días de la semana?', '/booksImages/9788416188055.jpg', '9788416188055', '2015', 7, 7, NULL, 7, 7),
(9, 'RIVALES DIVINOS', 'Tras permanecer dormidos durante siglos, los dioses vuelven a la guerra... Lo único que la joven periodista Iris Winnow desea es mantener unida a su familia. Con un hermano obligado a luchar en el bando de los dioses y desaparecido del frente de batalla y una madre que se ahoga en su pena, la mejor opción de Iris es obtener el ascenso a columnista del Oath Gazette. Pero cuando las cartas de Iris a su hermano caen en las manos equivocadas —las del apuesto pero frío Roman Kitt, su rival en el periódico—, se crea una extraña conexión mágica. Inmersos en el centro de una guerra mística, armados con sus máquinas de escribir, ¿podrá su vínculo superar la lucha por el destino de la humanidad y, lo que es más importante, de su amor? Una novela de fantasía, un enemies to lovers épico lleno de esperanza, de tristeza y del incomparable poder del amor.', '/booksImages/9786124924286.jpg', '9786124924286', '2024', 8, 8, NULL, 8, 8),
(20, 'LO QUE LA NIEVE SUSURRA AL CAER', 'Para Hunter, la música es mucho más que un conjunto de notas que dan forma a una melodía. Las canciones que compone son un refugio, un testimonio de sus sueños y miedos, de sus ganas y carencias. Sin embargo, esa inspiración enmudece cuando encuentra una carta manuscrita en su buzón, que lo obliga a cuestionarse todo lo que sabe sobre sí mismo.', '/booksImages/9786287575202.jpg', '9786287575202', '2003', 5, 4, NULL, 8, 8);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `prestamo`
--

CREATE TABLE `prestamo` (
  `id` int NOT NULL,
  `cantidad` int NOT NULL,
  `fecha_prestamo` date NOT NULL,
  `fecha_devolucion` date NOT NULL,
  `estado` int NOT NULL DEFAULT '0',
  `id_book` int NOT NULL,
  `id_user` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `prestamo`
--

INSERT INTO `prestamo` (`id`, `cantidad`, `fecha_prestamo`, `fecha_devolucion`, `estado`, `id_book`, `id_user`) VALUES
(70, 2, '2024-07-11', '2024-07-19', 0, 2, 16),
(71, 1, '2024-07-23', '2024-08-01', 0, 20, 15),
(80, 1, '2024-07-10', '2024-07-10', 0, 2, 12),
(81, 1, '2024-07-10', '2024-07-10', 0, 3, 12),
(82, 1, '2024-07-10', '2024-07-10', 0, 3, 15),
(83, 1, '2024-07-10', '2024-07-10', 0, 3, 15);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `user`
--

CREATE TABLE `user` (
  `id` int NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `email` varchar(70) NOT NULL,
  `is_admin` int NOT NULL,
  `nombres` varchar(70) NOT NULL,
  `apellidos` varchar(70) NOT NULL,
  `dni` varchar(8) NOT NULL,
  `direccion` varchar(70) NOT NULL,
  `url_image` varchar(70) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `user`
--

INSERT INTO `user` (`id`, `username`, `password`, `email`, `is_admin`, `nombres`, `apellidos`, `dni`, `direccion`, `url_image`) VALUES
(1, 'admin', 'admin', 'tragaperras@gmial.com', 1, 'Juan ', 'Melendez', '78967345', 'por alli cerca', '/UserprofilePhotos/defaultPhoto.jpg'),
(2, 'user', 'user', 'pedroech@gmail.com', 0, 'Pedro', 'Suarez', '02345678', 'en su casa', '/UserprofilePhotos/defaultPhoto.jpg'),
(11, 'tilin12', '123', 'cssd', 0, 'sdsdsds', 'sdsd', '54567234', 'sdsdsd', '/UserprofilePhotos/defaultPhoto.jpg'),
(12, 'chad123', '123', 'sdsdsds', 0, 'Juan', 'sdds', '12345678', 'chad123', '/UserprofilePhotos/12345678.jpg'),
(15, 'test1', '123', 'test1@gmail.com', 0, 'test', 'test', '87654322', 'test1', '/UserprofilePhotos/87654322.jpg'),
(16, 'test2', '123', 'hsjsd@gmail.com', 0, 'NNN', 'NNN', '1234567', 'si', '/UserprofilePhotos/defaultPhoto.jpg');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `autor`
--
ALTER TABLE `autor`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `comentarios`
--
ALTER TABLE `comentarios`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `donacion`
--
ALTER TABLE `donacion`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `editorial`
--
ALTER TABLE `editorial`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `libro`
--
ALTER TABLE `libro`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `prestamo`
--
ALTER TABLE `prestamo`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `autor`
--
ALTER TABLE `autor`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT de la tabla `comentarios`
--
ALTER TABLE `comentarios`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- AUTO_INCREMENT de la tabla `donacion`
--
ALTER TABLE `donacion`
  MODIFY `id` int NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `editorial`
--
ALTER TABLE `editorial`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT de la tabla `libro`
--
ALTER TABLE `libro`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT de la tabla `prestamo`
--
ALTER TABLE `prestamo`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=84;

--
-- AUTO_INCREMENT de la tabla `user`
--
ALTER TABLE `user`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
