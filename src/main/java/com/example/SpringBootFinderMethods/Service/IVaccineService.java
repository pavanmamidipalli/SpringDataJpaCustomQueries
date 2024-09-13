package com.example.SpringBootFinderMethods.Service;

import com.example.SpringBootFinderMethods.Entity.VaccineDetails;
import org.springframework.data.repository.query.Param;

import java.util.Collection;
import java.util.Date;
import java.util.List;

public interface IVaccineService {
    public List<VaccineDetails> searchVaccineDetails();
    public List<VaccineDetails> searchAllByVaccineName(String name);
    public List<VaccineDetails> searchByVaccineNameIn(List<String> list);
    public List<String> searchByNamesBetween(int name1,int name2);
    public int updatedTableDetails(int price, String name);
    public int deleteByPricings(int price1,int price2);
    public int saveallDetails(String name,String compnay,int price);
    public Date getTimeDetails();
}
