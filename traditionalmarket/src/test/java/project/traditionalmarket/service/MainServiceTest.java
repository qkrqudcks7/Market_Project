package project.traditionalmarket.service;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import project.traditionalmarket.domain.Main;
import project.traditionalmarket.repository.MainRepository;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
@Transactional
@SpringBootTest
class MainServiceTest {
    private MainRepository mainRepository;

    public void test() {
        Main main = mainRepository.findById(1L).get();

        System.out.println(main.getDay());
        System.out.println(main.getMarketName());
        System.out.println(main.getStateName());
        System.out.println(main.getCountryName());
        System.out.println(main.getItemCode());
        System.out.println(main.getItemName());
        System.out.println(main.getKindName());
        System.out.println(main.getProductClsName());
        System.out.println(main.getProductRank());
        System.out.println(main.getPrice());
        System.out.println(main.getWholeSaleUnit());
        System.out.println(main.getWholeSaleUnitSize());
        System.out.println(main.getRetailSaleUnit());
        System.out.println(main.getRetailSaleUnit());
    }
}