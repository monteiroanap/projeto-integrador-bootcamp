package com.example.projetointegrador.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projetointegrador.model.Inventory;
import com.example.projetointegrador.repository.InventoryRepo;

@Service
public class InventoryService {
    
    @Autowired
    private InventoryRepo inventoryRepo;

    public Inventory saveInventory(Inventory inventory) {
        return inventoryRepo.save(inventory);
    }
}
