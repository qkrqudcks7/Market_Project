package project.traditionalmarket.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import project.traditionalmarket.dto.Avg;
import project.traditionalmarket.repository.MainRepository;

@Service
@Transactional
@RequiredArgsConstructor
public class AvgService {
    private final MainRepository mainRepository;

    public double return1(String key, Avg avg,String market) {
        Double byKeword = mainRepository.find1ByKeword(key, market);

        if(byKeword!=null){
            avg.setJanuary1(byKeword);

            return avg.getJanuary1();
        }
        else {
            return 0;
        }

    }

    public double return2(String key, Avg avg, String market) {
        Double byKeword = mainRepository.find2ByKeword(key, market);
        if (byKeword != null) {
            avg.setFebruary2(byKeword);
            return avg.getFebruary2();
        }
        else {
            return 0;
        }


    }

    public double return3(String key, Avg avg, String market) {
        Double byKeword = mainRepository.find3ByKeword(key, market);
        if(byKeword != null) {
            avg.setMarch3(byKeword);
            return avg.getMarch3();
        }
        else {
            return 0;
        }

    }

    public double return4(String key, Avg avg, String market) {
        Double byKeword = mainRepository.find4ByKeword(key, market);
        if(byKeword != null) {
            avg.setApril4(byKeword);
            return avg.getApril4();
        }
        else {
            return 0;
        }

    }

    public double return5(String key, Avg avg, String market) {
        Double byKeword = mainRepository.find5ByKeword(key, market);
        if(byKeword != null) {
            avg.setMay5(byKeword);
            return avg.getMay5();
        }
        else {
            return 0;
        }

    }

    public double return6(String key, Avg avg, String market) {
        Double byKeword = mainRepository.find6ByKeword(key, market);
        if(byKeword != null) {
            avg.setJun6(byKeword);
            return avg.getJun6();
        }
        else {
            return 0;
        }

    }

    public double return7(String key, Avg avg, String market) {
        Double byKeword = mainRepository.find7ByKeword(key, market);
        if(byKeword != null) {
            avg.setJuly7(byKeword);
            return avg.getJuly7();
        }
        else {
            return 0;
        }

    }

    public double return8(String key, Avg avg, String market) {
        Double byKeword = mainRepository.find8ByKeword(key, market);
        if(byKeword != null) {
            avg.setAugust8(byKeword);
            return avg.getAugust8();
        }
        else {
            return 0;
        }
    }

    public double return9(String key, Avg avg, String market) {
        Double byKeword = mainRepository.find9ByKeword(key, market);
        if(byKeword != null) {
            avg.setSeptember9(byKeword);
            return avg.getSeptember9();
        }
        else {
            return 0;
        }
    }

    public double return10(String key, Avg avg, String market) {
        Double byKeword = mainRepository.find10ByKeword(key, market);
        if(byKeword != null) {
            avg.setOctober10(byKeword);
            return avg.getOctober10();
        }
        else {
            return 0;
        }

    }

    public double return11(String key, Avg avg, String market) {
        Double byKeword = mainRepository.find11ByKeword(key, market);
        if(byKeword != null) {
            avg.setNovember11(byKeword);
            return avg.getNovember11();
        }
        else {
            return 0;
        }
    }

    public double return1(String key, String kindName, String productRank, String productClsName, Avg dateAvg){
        Double byKeyword = mainRepository.find1ByKeyword(key, kindName, productRank, productClsName);
        if(byKeyword != null){
            dateAvg.setJanuary1(byKeyword);
            return dateAvg.getJanuary1();
        }
        else {
            return 0;
        }
    }

    public double return2(String key, String kindName, String productRank, String productClsName, Avg dateAvg){
        Double byKeyword = mainRepository.find2ByKeyword(key, kindName, productRank, productClsName);
        if(byKeyword != null){
            dateAvg.setFebruary2(byKeyword);
            return dateAvg.getFebruary2();
        }
        else {
            return 0;
        }
    }

    public double return3(String key, String kindName, String productRank, String productClsName, Avg dateAvg){
        Double byKeyword = mainRepository.find3ByKeyword(key, kindName, productRank, productClsName);
        if(byKeyword != null){
            dateAvg.setMarch3(byKeyword);
            return dateAvg.getMarch3();
        }
        else {
            return 0;
        }
    }

    public double return4(String key, String kindName, String productRank, String productClsName, Avg dateAvg){
        Double byKeyword = mainRepository.find4ByKeyword(key, kindName, productRank, productClsName);
        if(byKeyword != null){
            dateAvg.setApril4(byKeyword);
            return dateAvg.getApril4();
        }
        else {
            return 0;
        }
    }

    public double return5(String key, String kindName, String productRank, String productClsName, Avg dateAvg){
        Double byKeyword = mainRepository.find5ByKeyword(key, kindName, productRank, productClsName);
        if(byKeyword != null){
            dateAvg.setMay5(byKeyword);
            return dateAvg.getMay5();
        }
        else {
            return 0;
        }
    }

    public double return6(String key, String kindName, String productRank, String productClsName, Avg dateAvg){
        Double byKeyword = mainRepository.find6ByKeyword(key, kindName, productRank, productClsName);
        if(byKeyword != null){
            dateAvg.setJun6(byKeyword);
            return dateAvg.getJun6();
        }
        else {
            return 0;
        }
    }

    public double return7(String key, String kindName, String productRank, String productClsName, Avg dateAvg){
        Double byKeyword = mainRepository.find7ByKeyword(key, kindName, productRank, productClsName);
        if(byKeyword != null){
            dateAvg.setJuly7(byKeyword);
            return dateAvg.getJuly7();
        }
        else {
            return 0;
        }
    }

    public double return8(String key, String kindName, String productRank, String productClsName, Avg dateAvg){
        Double byKeyword = mainRepository.find8ByKeyword(key, kindName, productRank, productClsName);
        if(byKeyword != null){
            dateAvg.setAugust8(byKeyword);
            return dateAvg.getAugust8();
        }
        else {
            return 0;
        }
    }

    public double return9(String key, String kindName, String productRank, String productClsName, Avg dateAvg){
        Double byKeyword = mainRepository.find9ByKeyword(key, kindName, productRank, productClsName);
        if(byKeyword != null){
            dateAvg.setSeptember9(byKeyword);
            return dateAvg.getSeptember9();
        }
        else {
            return 0;
        }
    }

    public double return10(String key, String kindName, String productRank, String productClsName, Avg dateAvg){
        Double byKeyword = mainRepository.find10ByKeyword(key, kindName, productRank, productClsName);
        if(byKeyword != null){
            dateAvg.setOctober10(byKeyword);
            return dateAvg.getOctober10();
        }
        else {
            return 0;
        }
    }

    public double return11(String key, String kindName, String productRank, String productClsName, Avg dateAvg){
        Double byKeyword = mainRepository.find11ByKeyword(key, kindName, productRank, productClsName);
        if(byKeyword != null){
            dateAvg.setNovember11(byKeyword);
            return dateAvg.getNovember11();
        }
        else {
            return 0;
        }
    }

    public double returnMin1(String key, String kindName, String productRank, String productClsName, Avg dateAvg){
        Double byKeyword = mainRepository.find1ByKeywordMin(key, kindName, productRank, productClsName);
        if(byKeyword != null){
            dateAvg.setJanuary1(byKeyword);
            return dateAvg.getJanuary1();
        }
        else {
            return 0;
        }
    }

    public double returnMin2(String key, String kindName, String productRank, String productClsName, Avg dateAvg){
        Double byKeyword = mainRepository.find2ByKeywordMin(key, kindName, productRank, productClsName);
        if(byKeyword != null){
            dateAvg.setFebruary2(byKeyword);
            return dateAvg.getFebruary2();
        }
        else {
            return 0;
        }
    }

    public double returnMin3(String key, String kindName, String productRank, String productClsName, Avg dateAvg){
        Double byKeyword = mainRepository.find3ByKeywordMin(key, kindName, productRank, productClsName);
        if(byKeyword != null){
            dateAvg.setMarch3(byKeyword);
            return dateAvg.getMarch3();
        }
        else {
            return 0;
        }
    }

    public double returnMin4(String key, String kindName, String productRank, String productClsName, Avg dateAvg){
        Double byKeyword = mainRepository.find4ByKeywordMin(key, kindName, productRank, productClsName);
        if(byKeyword != null){
            dateAvg.setApril4(byKeyword);
            return dateAvg.getApril4();
        }
        else {
            return 0;
        }
    }

    public double returnMin5(String key, String kindName, String productRank, String productClsName, Avg dateAvg){
        Double byKeyword = mainRepository.find5ByKeywordMin(key, kindName, productRank, productClsName);
        if(byKeyword != null){
            dateAvg.setMay5(byKeyword);
            return dateAvg.getMay5();
        }
        else {
            return 0;
        }
    }

    public double returnMin6(String key, String kindName, String productRank, String productClsName, Avg dateAvg){
        Double byKeyword = mainRepository.find6ByKeywordMin(key, kindName, productRank, productClsName);
        if(byKeyword != null){
            dateAvg.setJun6(byKeyword);
            return dateAvg.getJun6();
        }
        else {
            return 0;
        }
    }

    public double returnMin7(String key, String kindName, String productRank, String productClsName, Avg dateAvg){
        Double byKeyword = mainRepository.find7ByKeywordMin(key, kindName, productRank, productClsName);
        if(byKeyword != null){
            dateAvg.setJuly7(byKeyword);
            return dateAvg.getJuly7();
        }
        else {
            return 0;
        }
    }

    public double returnMin8(String key, String kindName, String productRank, String productClsName, Avg dateAvg){
        Double byKeyword = mainRepository.find8ByKeywordMin(key, kindName, productRank, productClsName);
        if(byKeyword != null){
            dateAvg.setAugust8(byKeyword);
            return dateAvg.getAugust8();
        }
        else {
            return 0;
        }
    }

    public double returnMin9(String key, String kindName, String productRank, String productClsName, Avg dateAvg){
        Double byKeyword = mainRepository.find9ByKeywordMin(key, kindName, productRank, productClsName);
        if(byKeyword != null){
            dateAvg.setSeptember9(byKeyword);
            return dateAvg.getSeptember9();
        }
        else {
            return 0;
        }
    }

    public double returnMin10(String key, String kindName, String productRank, String productClsName, Avg dateAvg){
        Double byKeyword = mainRepository.find10ByKeywordMin(key, kindName, productRank, productClsName);
        if(byKeyword != null){
            dateAvg.setOctober10(byKeyword);
            return dateAvg.getOctober10();
        }
        else {
            return 0;
        }
    }

    public double returnMin11(String key, String kindName, String productRank, String productClsName, Avg dateAvg){
        Double byKeyword = mainRepository.find11ByKeywordMin(key, kindName, productRank, productClsName);
        if(byKeyword != null){
            dateAvg.setNovember11(byKeyword);
            return dateAvg.getNovember11();
        }
        else {
            return 0;
        }
    }

    public double returnMax1(String key, String kindName, String productRank, String productClsName, Avg dateAvg){
        Double byKeyword = mainRepository.find1ByKeywordMax(key, kindName, productRank, productClsName);
        if(byKeyword != null){
            dateAvg.setJanuary1(byKeyword);
            return dateAvg.getJanuary1();
        }
        else {
            return 0;
        }
    }

    public double returnMax2(String key, String kindName, String productRank, String productClsName, Avg dateAvg){
        Double byKeyword = mainRepository.find2ByKeywordMax(key, kindName, productRank, productClsName);
        if(byKeyword != null){
            dateAvg.setFebruary2(byKeyword);
            return dateAvg.getFebruary2();
        }
        else {
            return 0;
        }
    }

    public double returnMax3(String key, String kindName, String productRank, String productClsName, Avg dateAvg){
        Double byKeyword = mainRepository.find3ByKeywordMax(key, kindName, productRank, productClsName);
        if(byKeyword != null){
            dateAvg.setMarch3(byKeyword);
            return dateAvg.getMarch3();
        }
        else {
            return 0;
        }
    }

    public double returnMax4(String key, String kindName, String productRank, String productClsName, Avg dateAvg){
        Double byKeyword = mainRepository.find4ByKeywordMax(key, kindName, productRank, productClsName);
        if(byKeyword != null){
            dateAvg.setApril4(byKeyword);
            return dateAvg.getApril4();
        }
        else {
            return 0;
        }
    }

    public double returnMax5(String key, String kindName, String productRank, String productClsName, Avg dateAvg){
        Double byKeyword = mainRepository.find5ByKeywordMax(key, kindName, productRank, productClsName);
        if(byKeyword != null){
            dateAvg.setMay5(byKeyword);
            return dateAvg.getMay5();
        }
        else {
            return 0;
        }
    }

    public double returnMax6(String key, String kindName, String productRank, String productClsName, Avg dateAvg){
        Double byKeyword = mainRepository.find6ByKeywordMax(key, kindName, productRank, productClsName);
        if(byKeyword != null){
            dateAvg.setJun6(byKeyword);
            return dateAvg.getJun6();
        }
        else {
            return 0;
        }
    }

    public double returnMax7(String key, String kindName, String productRank, String productClsName, Avg dateAvg){
        Double byKeyword = mainRepository.find7ByKeywordMax(key, kindName, productRank, productClsName);
        if(byKeyword != null){
            dateAvg.setJuly7(byKeyword);
            return dateAvg.getJuly7();
        }
        else {
            return 0;
        }
    }

    public double returnMax8(String key, String kindName, String productRank, String productClsName, Avg dateAvg){
        Double byKeyword = mainRepository.find8ByKeywordMax(key, kindName, productRank, productClsName);
        if(byKeyword != null){
            dateAvg.setAugust8(byKeyword);
            return dateAvg.getAugust8();
        }
        else {
            return 0;
        }
    }

    public double returnMax9(String key, String kindName, String productRank, String productClsName, Avg dateAvg){
        Double byKeyword = mainRepository.find9ByKeywordMax(key, kindName, productRank, productClsName);
        if(byKeyword != null){
            dateAvg.setSeptember9(byKeyword);
            return dateAvg.getSeptember9();
        }
        else {
            return 0;
        }
    }

    public double returnMax10(String key, String kindName, String productRank, String productClsName, Avg dateAvg){
        Double byKeyword = mainRepository.find10ByKeywordMax(key, kindName, productRank, productClsName);
        if(byKeyword != null){
            dateAvg.setOctober10(byKeyword);
            return dateAvg.getOctober10();
        }
        else {
            return 0;
        }
    }

    public double returnMax11(String key, String kindName, String productRank, String productClsName, Avg dateAvg){
        Double byKeyword = mainRepository.find11ByKeywordMax(key, kindName, productRank, productClsName);
        if(byKeyword != null){
            dateAvg.setNovember11(byKeyword);
            return dateAvg.getNovember11();
        }
        else {
            return 0;
        }
    }
}
