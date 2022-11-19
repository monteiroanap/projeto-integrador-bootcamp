package com.example.projetointegrador.service;

import com.example.projetointegrador.model.CartItem;
import com.example.projetointegrador.repository.CartItemRepository;
import com.example.projetointegrador.service.interfaces.ICartItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartItemService implements ICartItemService{
    
    @Autowired
    private CartItemRepository cartItemRepository;

    @Override
    public List<CartItem> getCartItems(Long cartId) {
        return cartItemRepository.findAllCartItemsByCartId(cartId);
    }
}