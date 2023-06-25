package com.example.project.Crawling;

import com.example.project.Product.Market;
import com.example.project.Product.Product;
import lombok.RequiredArgsConstructor;

import java.util.HashMap;

@RequiredArgsConstructor
public class CrawlingManagerImpl implements CrawlingManager{

    private final Joonggonara joonggonara;
    private final Bunjang bunjang;

    @Override
    public HashMap<Long, Product> getPage(Market market, String category, int pagenum) {

        HashMap<Long, Product> page = new HashMap<>();

        if (market == Market.JOONGGONARA) {
            page = joonggonara.getPage(category, pagenum);
        }
        else if (market == Market.BUNJANG){
            page = bunjang.getPage(category, pagenum);
        }

        return page;
    }

    @Override
    public HashMap<Long, Product> getPage(Market market, int page, String search) {
        return null;
    }

    @Override
    public Product getProduct(Long id) {
        return null;
    }
}
