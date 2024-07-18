/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import dao.DonationDAO;
import model.DonationModel;

/**
 *
 * @author Hamer
 */
public class DonationService {
    private DonationDAO donationDAO;

    public DonationService(DonationDAO donationDAO) {
        this.donationDAO = donationDAO;
    }
    
    public void addDonation(DonationModel donation){
        donationDAO.insertInto(donation);
    }
}
