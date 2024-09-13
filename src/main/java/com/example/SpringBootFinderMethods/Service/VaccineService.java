package com.example.SpringBootFinderMethods.Service;

import com.example.SpringBootFinderMethods.Entity.VaccineDetails;
import com.example.SpringBootFinderMethods.Repo.VaccineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;
@Service
public class VaccineService implements IVaccineService{
    @Autowired
    private VaccineRepository vaccineRepository;
    @Override
    public List<VaccineDetails> searchVaccineDetails() {
        return vaccineRepository.fetchVaccineDetails();
    }

    @Override
    public List<VaccineDetails> searchAllByVaccineName(String name) {
        return vaccineRepository.fectchAllByVaccineName(name);
    }

    @Override
    public List<VaccineDetails> searchByVaccineNameIn(List<String> list) {
        return vaccineRepository.fetchByVaccineNameIn(list);
    }

    @Override
    public List<String> searchByNamesBetween(int name1, int name2) {
        return vaccineRepository.fetchByNamesBetween(name1,name2);
    }

    @Override
    public int updatedTableDetails(int price, String name) {
        return vaccineRepository.updateTableDetails(price,name);
    }

    @Override
    public int deleteByPricings(int price1, int price2) {
        return vaccineRepository.deleteByPricing(price1,price2);
    }

    @Override
    public int saveallDetails(String name, String compnay, int price) {
        return vaccineRepository.saveDetails(name,compnay,price);
    }

    @Override
    public Date getTimeDetails() {
        return vaccineRepository.getTimeDetails();
    }


}
