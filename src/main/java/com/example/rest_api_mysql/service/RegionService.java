package com.example.rest_api_mysql.service;

import com.example.rest_api_mysql.model.Region;
import com.example.rest_api_mysql.repository.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public class RegionService {
    @Autowired
    private RegionRepository regionRepository;

    public List<Region> getAllRegion(){
        return regionRepository.findAll();
    }
    public ResponseEntity<Region> saveRegion(Region region){
        return new ResponseEntity<>(regionRepository.save(region), HttpStatus.CREATED);
    }
    public Region getRegionById(Integer id) {
        Optional<Region> user = regionRepository.findById(id);

        if (region.isPresent()) {
            return region.get();
        } else {
            throw new RuntimeException();
        }
    }
    public ResponseEntity<Region> updateRegion(Integer id, Region region){
        Region findUser  = regionRepository.findById(id).orElseThrow();
        findUser.setName(region.getName());
        findUser.setLastname(region.getLastname());

        return new ResponseEntity<>(regionRepository.save(findUser),HttpStatus.OK);
    }

    public ResponseEntity<Region> deleteRegion(Integer id){
        Region findRegion = userRepository.findById(id).orElseThrow();
        RegionRepository.deleteById(id);
        return new ResponseEntity<>(findRegion, HttpStatus.OK);
    }
}
