package com.project.appSantander.service;


import com.project.appSantander.mapper.StockMapper;
import com.project.appSantander.model.Stock;
import com.project.appSantander.model.dto.StockDTO;
import com.project.appSantander.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class StockService {

    @Autowired
    private StockRepository repository;

    @Autowired
    private StockMapper mapper;

    @Transactional
    public StockDTO save(StockDTO dto) {

        Stock stock = mapper.toEntity(dto);
        repository.save(stock);
        return mapper.toDto(stock);

    }
}
