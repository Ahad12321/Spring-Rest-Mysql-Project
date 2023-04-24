package com.example.restdemo.controller;

import com.example.restdemo.model.CloudVendor;
import com.example.restdemo.service.CloudVendorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorController {
   CloudVendorService cloudVendorService;

    public CloudVendorController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }
    @GetMapping ("/{vendorId}")
    public CloudVendor getCloudVendorDetails(@PathVariable("vendorId") String vendorId){
       return cloudVendorService.getCloudVendor(vendorId);
    }
 @GetMapping ()
    public List<CloudVendor>  getAllCloudVendorDetails(){
       return cloudVendorService.getAllCloudVendors();
    }
    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        cloudVendorService.createCloudVendor((cloudVendor));
        return "Cloud Vendor Created Successfully";
    }
    @PutMapping("/{vendorId")
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        cloudVendorService.updateCloudVendor(cloudVendor);
        return "CLoud Vendor Updated Successfilly";
    }
    @DeleteMapping("/{vonderId}")
    public String deleteCloudVendorDetails(@PathVariable ("vendorId")String vendorId){
        cloudVendorService.deleteCloudVendor(vendorId);
        return "CLoud Vendor Deleted Successfully";
    }



}

























