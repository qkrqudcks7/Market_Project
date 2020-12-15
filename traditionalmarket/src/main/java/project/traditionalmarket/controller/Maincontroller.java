package project.traditionalmarket.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import project.traditionalmarket.domain.Main;
import project.traditionalmarket.domain.Sub;
import project.traditionalmarket.dto.Avg;
import project.traditionalmarket.repository.MainRepository;
import project.traditionalmarket.service.AvgService;

import java.text.DecimalFormat;

@Controller
@RequiredArgsConstructor
public class Maincontroller {

    private final MainRepository mainRepository;
    private final AvgService avgService;

    @GetMapping("/index")
    public String mainPage() {
        return "index";
    }

    @GetMapping("/info")
    public String mainInfo() {
        return "market-introduce";
    }


    @GetMapping("/searchMain")
    public String mainSearch(String keyword,
                             Model model,
                             @PageableDefault(size=5) Pageable pageable) {
        Page<Main> mainPage = mainRepository.findMainByKeyword(keyword, pageable);
        model.addAttribute("mainPage",mainPage);
        model.addAttribute("keyword",keyword);
        model.addAttribute("maxPage",10);
        model.addAttribute("check",0);

        return "information-option";
    }

    @GetMapping("/searchMain2")
    public String mainSearch2(String keyword,
                              String priority,
                              Model model,
                              @PageableDefault(size=5) Pageable pageable) {
        Page<Main> mainPage = mainRepository.findMainByKeyword2(keyword, pageable, priority);
        model.addAttribute("mainPage",mainPage);
        model.addAttribute("keyword",keyword);
        model.addAttribute("priority",priority);
        model.addAttribute("maxPage",10);

        return "information-option";
    }

    @GetMapping("/read")
    public String read(@RequestParam("id") Long id,
                       @RequestParam("keyword") String keyword,
                       Avg avg,
                       Model model) {
        Main main = mainRepository.findById(id).get();
        String market=main.getMarketName();
        String key=main.getKindName();
        model.addAttribute(main);

        double one = avgService.return1(key, avg, market);
        model.addAttribute("one",one);
        double two = avgService.return2(key, avg, market);
        model.addAttribute("two",two);
        double three = avgService.return3(key, avg, market);
        model.addAttribute("three",three);
        double four = avgService.return4(key, avg, market);
        model.addAttribute("four",four);
        double five = avgService.return5(key, avg, market);
        model.addAttribute("five",five);
        double six = avgService.return6(key, avg, market);
        model.addAttribute("six",six);
        double seven = avgService.return7(key, avg, market);
        model.addAttribute("seven",seven);
        double eight = avgService.return8(key, avg, market);
        model.addAttribute("eight",eight);
        double nine = avgService.return9(key, avg, market);
        model.addAttribute("nine",nine);
        double ten = avgService.return10(key, avg, market);
        model.addAttribute("ten",ten);
        double eleven = avgService.return11(key, avg, market);
        model.addAttribute("eleven",eleven);

        return "detail";
    }

    @GetMapping("/monthly")
    public String monthly(){
        return "monthly";
    }

    @GetMapping("/searchMonthly")
    public String searchMonthly(String keyword,
                                Model model,
                                @PageableDefault(size = 20) Pageable pageable){
        Page<Sub> mainPage = mainRepository.findSubByKeyword(keyword, pageable);
        model.addAttribute("keyword",keyword);
        model.addAttribute("mainPage",mainPage);

        return "monthly2";
    }
    @GetMapping("/searchResult")
    public String searchResult(@RequestParam String kindName,
                               @RequestParam String productRank,
                               @RequestParam String productClsName,
                               @RequestParam float circUnit,
                               @RequestParam String circUnitSize,
                               @RequestParam String keyword,
                               Avg dataAvg,
                               Model model){
        DecimalFormat formatter = new DecimalFormat("###,###");
        int size =(int) circUnit;
        model.addAttribute("kindName",kindName);
        model.addAttribute("productRank",productRank);
        model.addAttribute("productClsName",productClsName);
        model.addAttribute("circUnit",size);
        model.addAttribute("circUnitSize",circUnitSize);
        model.addAttribute("keyword",keyword);

        Double one = avgService.return1(keyword, kindName, productRank, productClsName, dataAvg);
        Double two = avgService.return2(keyword, kindName, productRank, productClsName, dataAvg);
        Double three = avgService.return3(keyword, kindName, productRank, productClsName, dataAvg);
        Double four = avgService.return4(keyword, kindName, productRank, productClsName, dataAvg);
        Double five = avgService.return5(keyword, kindName, productRank, productClsName, dataAvg);
        Double six = avgService.return6(keyword, kindName, productRank, productClsName, dataAvg);
        Double seven = avgService.return7(keyword, kindName, productRank, productClsName, dataAvg);
        Double eight = avgService.return8(keyword, kindName, productRank, productClsName, dataAvg);
        Double nine = avgService.return9(keyword, kindName, productRank, productClsName, dataAvg);
        Double ten = avgService.return10(keyword, kindName, productRank, productClsName, dataAvg);
        int eleven = (int) avgService.return11(keyword, kindName, productRank, productClsName, dataAvg);

        Double oneMin = avgService.returnMin1(keyword, kindName, productRank, productClsName, dataAvg);
        Double twoMin = avgService.returnMin2(keyword, kindName, productRank, productClsName, dataAvg);
        Double threeMin = avgService.returnMin3(keyword, kindName, productRank, productClsName, dataAvg);
        Double fourMin = avgService.returnMin4(keyword, kindName, productRank, productClsName, dataAvg);
        Double fiveMin = avgService.returnMin5(keyword, kindName, productRank, productClsName, dataAvg);
        Double sixMin = avgService.returnMin6(keyword, kindName, productRank, productClsName, dataAvg);
        Double sevenMin = avgService.returnMin7(keyword, kindName, productRank, productClsName, dataAvg);
        Double eightMin = avgService.returnMin8(keyword, kindName, productRank, productClsName, dataAvg);
        Double nineMin = avgService.returnMin9(keyword, kindName, productRank, productClsName, dataAvg);
        Double tenMin = avgService.returnMin10(keyword, kindName, productRank, productClsName, dataAvg);
        Double elevenMin = avgService.returnMin11(keyword, kindName, productRank, productClsName, dataAvg);

        Double oneMax = avgService.returnMax1(keyword, kindName, productRank, productClsName, dataAvg);
        Double twoMax = avgService.returnMax2(keyword, kindName, productRank, productClsName, dataAvg);
        Double threeMax = avgService.returnMax3(keyword, kindName, productRank, productClsName, dataAvg);
        Double fourMax = avgService.returnMax4(keyword, kindName, productRank, productClsName, dataAvg);
        Double fiveMax = avgService.returnMax5(keyword, kindName, productRank, productClsName, dataAvg);
        Double sixMax = avgService.returnMax6(keyword, kindName, productRank, productClsName, dataAvg);
        Double sevenMax = avgService.returnMax7(keyword, kindName, productRank, productClsName, dataAvg);
        Double eightMax = avgService.returnMax8(keyword, kindName, productRank, productClsName, dataAvg);
        Double nineMax = avgService.returnMax9(keyword, kindName, productRank, productClsName, dataAvg);
        Double tenMax = avgService.returnMax10(keyword, kindName, productRank, productClsName, dataAvg);
        Double elevenMax = avgService.returnMax11(keyword, kindName, productRank, productClsName, dataAvg);

        model.addAttribute("changeEleven",formatter.format(eleven));
        model.addAttribute("one",one);
        model.addAttribute("two",two);
        model.addAttribute("three",three);
        model.addAttribute("four",four);
        model.addAttribute("five",five);
        model.addAttribute("six",six);
        model.addAttribute("seven",seven);
        model.addAttribute("eight",eight);
        model.addAttribute("nine",nine);
        model.addAttribute("ten",ten);
        model.addAttribute("eleven",eleven);

        model.addAttribute("oneMin",oneMin);
        model.addAttribute("twoMin",twoMin);
        model.addAttribute("threeMin",threeMin);
        model.addAttribute("fourMin",fourMin);
        model.addAttribute("fiveMin",fiveMin);
        model.addAttribute("sixMin",sixMin);
        model.addAttribute("sevenMin",sevenMin);
        model.addAttribute("eightMin",eightMin);
        model.addAttribute("nineMin",nineMin);
        model.addAttribute("tenMin",tenMin);
        model.addAttribute("elevenMin",elevenMin);

        model.addAttribute("oneMax",oneMax);
        model.addAttribute("twoMax",twoMax);
        model.addAttribute("threeMax",threeMax);
        model.addAttribute("fourMax",fourMax);
        model.addAttribute("fiveMax",fiveMax);
        model.addAttribute("sixMax",sixMax);
        model.addAttribute("sevenMax",sevenMax);
        model.addAttribute("eightMax",eightMax);
        model.addAttribute("nineMax",nineMax);
        model.addAttribute("tenMax",tenMax);
        model.addAttribute("elevenMax",elevenMax);

        return "monthly-option";
    }
}
