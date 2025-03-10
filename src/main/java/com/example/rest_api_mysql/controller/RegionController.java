package com.example.rest_api_mysql.controller;

import com.example.rest_api_mysql.model.Region;
import com.example.rest_api_mysql.model.User;
import com.example.rest_api_mysql.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class RegionController {

    @Autowired
    private RegionService RegionService;

    @GetMapping("/regions")
    public @ResponseBody List<Region> getAllRegions() {
        return RegionService.getAllRegions();

    }

    @PostMapping("/region")
    public ResponseEntity<Region> saveRegion(@RequestBody User Region) {
        return RegionService.saveRegion(Region);
    }

    @GetMapping("/region/{id}")
    public Region getRegionById(@PathVariable("id") Integer RegionId) {

        return RegionService.getRegionById(RegionId);
    }



    @PutMapping("/region/{id}")
    public ResponseEntity<Region> update(
            @PathVariable("id") Integer RegionId,
            @RequestBody Region region){
        return RegionService.updateRegion(RegionId, region);

    }

    @DeleteMapping("/region/{id}")
    public ResponseEntity<Region> deleteUser(
            @PathVariable("id")Integer id) {
        return RegionService.deleteRegion(id);
    }
}
