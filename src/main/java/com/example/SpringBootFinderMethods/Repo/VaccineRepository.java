package com.example.SpringBootFinderMethods.Repo;


import com.example.SpringBootFinderMethods.Entity.VaccineDetails;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Stack;

@Repository
public interface VaccineRepository extends JpaRepository<VaccineDetails,Integer> {
    @Query("FROM VaccineDetails")
    public List<VaccineDetails> fetchVaccineDetails();
    @Query("From VaccineDetails where vaccineName=:name")
    public List<VaccineDetails> fectchAllByVaccineName(@Param("name") String name);
    @Query("From VaccineDetails where vaccineName in(:list)")
    public List<VaccineDetails> fetchByVaccineNameIn(List<String> list);
    @Query("Select vaccineName,vaccineCompany from VaccineDetails where pricing between :name1 and :name2")
    public List<String> fetchByNamesBetween(int name1,int name2);
    @Transactional
    @Modifying
    @Query("UPDATE VaccineDetails SET pricing=:price WHERE vaccineName=:name")
    public int updateTableDetails(int price, String name);
    @Transactional
    @Modifying
    @Query("DELETE FROM VaccineDetails WHERE pricing BETWEEN :price1 AND :price2")
    public int deleteByPricing(int price1,int price2);
    @Modifying
    @Transactional
    @Query(value="INSERT INTO vaccine_details (`vaccine_name`,`vaccine_company`,`pricing`) VALUES(?,?,?)",nativeQuery=true)
    public int saveDetails(String name,String compnay,int price);
    @Query(value="SELECT NOW() FROM DUAL",nativeQuery = true)
    public Date getTimeDetails();

}
