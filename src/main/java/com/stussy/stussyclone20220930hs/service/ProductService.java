package com.stussy.stussyclone20220930hs.service;

import com.stussy.stussyclone20220930hs.dto.CheckoutRespDto;
import com.stussy.stussyclone20220930hs.dto.CollectionListRespDto;
import com.stussy.stussyclone20220930hs.dto.ProductRespDto;

import java.util.List;

public interface ProductService {
    public List<CollectionListRespDto> getProductList(String category, int page) throws Exception;
    public ProductRespDto getProduct(int pdtId) throws Exception;
    public CheckoutRespDto getCheckoutProduct(int pdtDtlId) throws Exception;
}