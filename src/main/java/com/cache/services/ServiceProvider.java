package com.cache.services;

import java.util.Map;

public interface ServiceProvider {
	Map<String, Long> GetAllDevicesCatagory(String Device_Type);
	Map<String, Double> GetPriceOfDevice(String Device_Name);
}
