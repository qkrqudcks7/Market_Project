package project.traditionalmarket.repository;

import com.querydsl.core.QueryResults;
import com.querydsl.core.types.dsl.CaseBuilder;
import com.querydsl.core.types.dsl.NumberExpression;
import com.querydsl.jpa.JPQLQuery;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import project.traditionalmarket.domain.Main;
import project.traditionalmarket.domain.QMain;
import project.traditionalmarket.domain.QSub;
import project.traditionalmarket.domain.Sub;

public class MainRepositoryExtensionImpl extends QuerydslRepositorySupport implements MainRepositoryExtension {

    private final JPAQueryFactory queryFactory;

    public MainRepositoryExtensionImpl(JPAQueryFactory queryFactory) {
        super(Main.class);
        this.queryFactory = queryFactory;
    }

    @Override
    public Page<Main> findByKeyword(String keyword, String nation, Pageable pageable,String priority1,String priority2,String priority3) {
        QMain main = QMain.main;

        NumberExpression<Integer> productRankPath = new CaseBuilder()
                .when(main.productRank.eq("상품")).then(1)
                .when(main.productRank.eq("중품")).then(2)
                .when(main.productRank.eq("M과")).then(3)
                .when(main.productRank.eq("S과")).then(4)
                .when(main.productRank.eq("1+등급")).then(5)
                .when(main.productRank.eq("1등급")).then(6)
                .when(main.productRank.eq("냉장")).then(7)
                .when(main.productRank.eq("냉동")).then(8)
                .otherwise(9);

        NumberExpression<Integer> productClsRankPath = new CaseBuilder()
                .when(main.productClsName.eq("도매")).then(1)
                .when(main.productClsName.eq("친환경")).then(2)
                .otherwise(3);


        JPQLQuery<Main> query = from(main).where(main.stateName.eq(nation)
                .and(main.day.eq(20191108))
                .and(main.itemName.contains(keyword)));

        if(priority1.equals("가격높은순")){
            query=query.orderBy(main.price.desc());
        }
        if(priority1.equals("가격낮은순")){
            query=query.orderBy(main.price.asc());
        }
        if(priority1.equals("품질높은순")){
            query=query.orderBy(productRankPath.asc());
        }
        if(priority1.equals("품질낮은순")){
            query=query.orderBy(productRankPath.desc());
        }
        if(priority1.equals("도매")) {
            query=query.orderBy(productClsRankPath.asc());
        }
        if(priority1.equals("소매")) {
            query=query.orderBy(productClsRankPath.desc());
        }

        if(priority2.equals("가격높은순")){
            query=query.orderBy(main.price.desc());
        }
        if(priority2.equals("가격낮은순")){
            query=query.orderBy(main.price.asc());
        }
        if(priority2.equals("품질높은순")){
            query=query.orderBy(productRankPath.asc());
        }
        if(priority2.equals("품질낮은순")){
            query=query.orderBy(productRankPath.desc());
        }
        if(priority2.equals("도매")) {
            query=query.orderBy(productClsRankPath.asc());
        }
        if(priority2.equals("소매")) {
            query=query.orderBy(productRankPath.desc());
        }

        if(priority3.equals("가격높은순")){
            query=query.orderBy(main.price.desc());
        }
        if(priority3.equals("가격낮은순")){
            query=query.orderBy(main.price.asc());
        }
        if(priority3.equals("품질높은순")){
            query=query.orderBy(productRankPath.asc());
        }
        if(priority3.equals("품질낮은순")){
            query=query.orderBy(productRankPath.desc());
        }
        if(priority3.equals("도매")) {
            query=query.orderBy(productClsRankPath.asc());
        }
        if(priority3.equals("소매")) {
            query=query.orderBy(productClsRankPath.desc());
        }


        JPQLQuery<Main> pagination = getQuerydsl().applyPagination(pageable, query);
        QueryResults<Main> fetchResults = pagination.fetchResults();

        return new PageImpl<>(fetchResults.getResults(),pageable,fetchResults.getTotal());
    }

    @Override
    public Page<Main> findMainByKeyword(String keyword, Pageable pageable) {
        QMain main2 = QMain.main;

        JPQLQuery<Main> query = from(main2).where(main2.day.eq(20191108)
                .and(main2.itemName.contains(keyword)));


        JPQLQuery<Main> pagination = getQuerydsl().applyPagination(pageable, query);
        QueryResults<Main> fetchResults = pagination.fetchResults();

        return new PageImpl<>(fetchResults.getResults(),pageable,fetchResults.getTotal());

    }

    @Override
    public Page<Sub> findSubByKeyword(String keyword, Pageable pageable) {
        QSub qSub = QSub.sub;

        JPQLQuery<Sub> query = from(qSub).where(qSub.day.eq(20191108).and(qSub.itemName.eq(keyword))).distinct();

        JPQLQuery<Sub> pagination = getQuerydsl().applyPagination(pageable, query);
        QueryResults<Sub> fetchResults = pagination.fetchResults();

        return new PageImpl<>(fetchResults.getResults(),pageable,fetchResults.getTotal());
    }

    @Override
    public Page<Main> findMainByKeyword2(String keyword, Pageable pageable,String priority) {
        QMain main2 = QMain.main;

        NumberExpression<Integer> productRankPath = new CaseBuilder()
                .when(main2.productRank.eq("유기농")).then(1)
                .when(main2.productRank.eq("무농약")).then(2)
                .when(main2.productRank.eq("무항생제")).then(3)
                .when(main2.productRank.eq("상품")).then(4)
                .when(main2.productRank.eq("중품")).then(5)
                .when(main2.productRank.eq("M과")).then(6)
                .when(main2.productRank.eq("S과")).then(7)
                .when(main2.productRank.eq("1+등급")).then(8)
                .when(main2.productRank.eq("1등급")).then(9)
                .when(main2.productRank.eq("냉장")).then(10)
                .otherwise(11);

        NumberExpression<Integer> productClsRankPath = new CaseBuilder()
                .when(main2.productClsName.eq("도매")).then(1)
                .when(main2.productClsName.eq("친환경")).then(2)
                .otherwise(3);

        JPQLQuery<Main> query = from(main2).where(main2.day.eq(20191108)
                .and(main2.itemName.contains(keyword)));

        if(priority.equals("가격높은순")){
            query=query.orderBy(main2.price.desc());
        }
        if(priority.equals("가격낮은순")){
            query=query.orderBy(main2.price.asc());
        }
        if(priority.equals("품질높은순")){
            query=query.orderBy(productRankPath.asc());
        }
        if(priority.equals("품질낮은순")){
            query=query.orderBy(productRankPath.desc());
        }
        if(priority.equals("도매")) {
            query=query.orderBy(productClsRankPath.asc());
        }
        if(priority.equals("소매")) {
            query=query.orderBy(productClsRankPath.desc());
        }

        JPQLQuery<Main> pagination = getQuerydsl().applyPagination(pageable, query);
        QueryResults<Main> fetchResults = pagination.fetchResults();

        return new PageImpl<>(fetchResults.getResults(),pageable,fetchResults.getTotal());
    }

    @Override
    public Double find1ByKeword(String key,String market) {
        QMain qMain = QMain.main;

        return queryFactory.select(qMain.price.avg().round())
                .from(qMain)
                .where(qMain.day.between(20190101,20190131).and(qMain.kindName.eq(key)).and(qMain.marketName.eq(market))).fetchOne();
    }

    @Override
    public Double find2ByKeword(String key,String market) {
        QMain qMain = QMain.main;

        return queryFactory.select(qMain.price.avg().round())
                .from(qMain)
                .where(qMain.day.between(20190201,20190228).and(qMain.kindName.eq(key)).and(qMain.marketName.eq(market))).fetchOne();
    }

    @Override
    public Double find3ByKeword(String key,String market) {
        QMain qMain = QMain.main;

        return queryFactory.select(qMain.price.avg().round())
                .from(qMain)
                .where(qMain.day.between(20190301,20190331).and(qMain.kindName.eq(key)).and(qMain.marketName.eq(market))).fetchOne();
    }

    @Override
    public Double find4ByKeword(String key,String market) {
        QMain qMain = QMain.main;

        return queryFactory.select(qMain.price.avg().round())
                .from(qMain)
                .where(qMain.day.between(20190401,20190430).and(qMain.kindName.eq(key)).and(qMain.marketName.eq(market))).fetchOne();
    }

    @Override
    public Double find5ByKeword(String key,String market) {
        QMain qMain = QMain.main;

        return queryFactory.select(qMain.price.avg().round())
                .from(qMain)
                .where(qMain.day.between(20190501,20190531).and(qMain.kindName.eq(key)).and(qMain.marketName.eq(market))).fetchOne();
    }

    @Override
    public Double find6ByKeword(String key,String market) {
        QMain qMain = QMain.main;

        return queryFactory.select(qMain.price.avg().round())
                .from(qMain)
                .where(qMain.day.between(20190601,20190630).and(qMain.kindName.eq(key)).and(qMain.marketName.eq(market))).fetchOne();
    }

    @Override
    public Double find7ByKeword(String key,String market) {
        QMain qMain = QMain.main;

        return queryFactory.select(qMain.price.avg().round())
                .from(qMain)
                .where(qMain.day.between(20190701,20190731).and(qMain.kindName.eq(key)).and(qMain.marketName.eq(market))).fetchOne();
    }

    @Override
    public Double find8ByKeword(String key,String market) {
        QMain qMain = QMain.main;

        return queryFactory.select(qMain.price.avg().round())
                .from(qMain)
                .where(qMain.day.between(20190801,20190831).and(qMain.kindName.eq(key)).and(qMain.marketName.eq(market))).fetchOne();
    }

    @Override
    public Double find9ByKeword(String key,String market) {
        QMain qMain = QMain.main;

        return queryFactory.select(qMain.price.avg().round())
                .from(qMain)
                .where(qMain.day.between(20190901,20190930).and(qMain.kindName.eq(key)).and(qMain.marketName.eq(market))).fetchOne();
    }

    @Override
    public Double find10ByKeword(String key,String market) {
        QMain qMain = QMain.main;

        return queryFactory.select(qMain.price.avg().round())
                .from(qMain)
                .where(qMain.day.between(20191001,20191031).and(qMain.kindName.eq(key)).and(qMain.marketName.eq(market))).fetchOne();
    }

    @Override
    public Double find11ByKeword(String key,String market) {
        QMain qMain = QMain.main;

        return queryFactory.select(qMain.price.avg().round())
                .from(qMain)
                .where(qMain.day.between(20191101,20191130).and(qMain.kindName.eq(key)).and(qMain.marketName.eq(market))).fetchOne();
    }

    @Override
    public Double find1ByKeyword(String key, String kindName, String productRank, String productClsName) {
        QSub qSub = QSub.sub;

        return queryFactory.select(qSub.avgPrice.avg().round())
                .from(qSub)
                .where(qSub.day.between(20190102,20190131).and(qSub.kindName.eq(kindName)).and(qSub.productRank.eq(productRank).and(qSub.productClsName.eq(productClsName)))).fetchOne();
    }

    @Override
    public Double find2ByKeyword(String key, String kindName, String productRank, String productClsName) {
        QSub qSub = QSub.sub;

        return queryFactory.select(qSub.avgPrice.avg().round())
                .from(qSub)
                .where(qSub.day.between(20190201,20190228).and(qSub.kindName.eq(kindName)).and(qSub.productRank.eq(productRank).and(qSub.productClsName.eq(productClsName)))).fetchOne();
    }

    @Override
    public Double find3ByKeyword(String key, String kindName, String productRank, String productClsName) {
        QSub qSub = QSub.sub;

        return queryFactory.select(qSub.avgPrice.avg().round())
                .from(qSub)
                .where(qSub.day.between(20190301,20190331).and(qSub.kindName.eq(kindName)).and(qSub.productRank.eq(productRank).and(qSub.productClsName.eq(productClsName)))).fetchOne();
    }

    @Override
    public Double find4ByKeyword(String key, String kindName, String productRank, String productClsName) {
        QSub qSub = QSub.sub;

        return queryFactory.select(qSub.avgPrice.avg().round())
                .from(qSub)
                .where(qSub.day.between(20190401,20190430).and(qSub.kindName.eq(kindName)).and(qSub.productRank.eq(productRank).and(qSub.productClsName.eq(productClsName)))).fetchOne();
    }

    @Override
    public Double find5ByKeyword(String key, String kindName, String productRank, String productClsName) {
        QSub qSub = QSub.sub;

        return queryFactory.select(qSub.avgPrice.avg().round())
                .from(qSub)
                .where(qSub.day.between(20190501,20190531).and(qSub.kindName.eq(kindName)).and(qSub.productRank.eq(productRank).and(qSub.productClsName.eq(productClsName)))).fetchOne();
    }

    @Override
    public Double find6ByKeyword(String key, String kindName, String productRank, String productClsName) {
        QSub qSub = QSub.sub;

        return queryFactory.select(qSub.avgPrice.avg().round())
                .from(qSub)
                .where(qSub.day.between(20190601,20190630).and(qSub.kindName.eq(kindName)).and(qSub.productRank.eq(productRank).and(qSub.productClsName.eq(productClsName)))).fetchOne();
    }

    @Override
    public Double find7ByKeyword(String key, String kindName, String productRank, String productClsName) {
        QSub qSub = QSub.sub;

        return queryFactory.select(qSub.avgPrice.avg().round())
                .from(qSub)
                .where(qSub.day.between(20190701,20190731).and(qSub.kindName.eq(kindName)).and(qSub.productRank.eq(productRank).and(qSub.productClsName.eq(productClsName)))).fetchOne();
    }

    @Override
    public Double find8ByKeyword(String key, String kindName, String productRank, String productClsName) {
        QSub qSub = QSub.sub;

        return queryFactory.select(qSub.avgPrice.avg().round())
                .from(qSub)
                .where(qSub.day.between(20190801,20190831).and(qSub.kindName.eq(kindName)).and(qSub.productRank.eq(productRank).and(qSub.productClsName.eq(productClsName)))).fetchOne();
    }

    @Override
    public Double find9ByKeyword(String key, String kindName, String productRank, String productClsName) {
        QSub qSub = QSub.sub;

        return queryFactory.select(qSub.avgPrice.avg().round())
                .from(qSub)
                .where(qSub.day.between(20190901,20190930).and(qSub.kindName.eq(kindName)).and(qSub.productRank.eq(productRank).and(qSub.productClsName.eq(productClsName)))).fetchOne();
    }

    @Override
    public Double find10ByKeyword(String key, String kindName, String productRank, String productClsName) {
        QSub qSub = QSub.sub;

        return queryFactory.select(qSub.avgPrice.avg().round())
                .from(qSub)
                .where(qSub.day.between(20191001,20191031).and(qSub.kindName.eq(kindName)).and(qSub.productRank.eq(productRank).and(qSub.productClsName.eq(productClsName)))).fetchOne();
    }

    @Override
    public Double find11ByKeyword(String key, String kindName, String productRank, String productClsName) {
        QSub qSub = QSub.sub;

        return queryFactory.select(qSub.avgPrice.avg().round())
                .from(qSub)
                .where(qSub.day.between(20191101,20191130).and(qSub.kindName.eq(kindName)).and(qSub.productRank.eq(productRank).and(qSub.productClsName.eq(productClsName)))).fetchOne();
    }

    @Override
    public Double find1ByKeywordMin(String key, String kindName, String productRank, String productClsName) {
        QSub qSub = QSub.sub;

        return queryFactory.select(qSub.minPrice.avg().round())
                .from(qSub)
                .where(qSub.day.between(20190102,20190131).and(qSub.kindName.eq(kindName)).and(qSub.productRank.eq(productRank).and(qSub.productClsName.eq(productClsName)))).fetchOne();
    }

    @Override
    public Double find2ByKeywordMin(String key, String kindName, String productRank, String productClsName) {
        QSub qSub = QSub.sub;

        return queryFactory.select(qSub.minPrice.avg().round())
                .from(qSub)
                .where(qSub.day.between(20190201,20190228).and(qSub.kindName.eq(kindName)).and(qSub.productRank.eq(productRank).and(qSub.productClsName.eq(productClsName)))).fetchOne();
    }

    @Override
    public Double find3ByKeywordMin(String key, String kindName, String productRank, String productClsName) {
        QSub qSub = QSub.sub;

        return queryFactory.select(qSub.minPrice.avg().round())
                .from(qSub)
                .where(qSub.day.between(20190301,20190331).and(qSub.kindName.eq(kindName)).and(qSub.productRank.eq(productRank).and(qSub.productClsName.eq(productClsName)))).fetchOne();
    }

    @Override
    public Double find4ByKeywordMin(String key, String kindName, String productRank, String productClsName) {
        QSub qSub = QSub.sub;

        return queryFactory.select(qSub.minPrice.avg().round())
                .from(qSub)
                .where(qSub.day.between(20190401,20190430).and(qSub.kindName.eq(kindName)).and(qSub.productRank.eq(productRank).and(qSub.productClsName.eq(productClsName)))).fetchOne();
    }

    @Override
    public Double find5ByKeywordMin(String key, String kindName, String productRank, String productClsName) {
        QSub qSub = QSub.sub;

        return queryFactory.select(qSub.minPrice.avg().round())
                .from(qSub)
                .where(qSub.day.between(20190501,20190531).and(qSub.kindName.eq(kindName)).and(qSub.productRank.eq(productRank).and(qSub.productClsName.eq(productClsName)))).fetchOne();
    }

    @Override
    public Double find6ByKeywordMin(String key, String kindName, String productRank, String productClsName) {
        QSub qSub = QSub.sub;

        return queryFactory.select(qSub.minPrice.avg().round())
                .from(qSub)
                .where(qSub.day.between(20190601,20190630).and(qSub.kindName.eq(kindName)).and(qSub.productRank.eq(productRank).and(qSub.productClsName.eq(productClsName)))).fetchOne();
    }

    @Override
    public Double find7ByKeywordMin(String key, String kindName, String productRank, String productClsName) {
        QSub qSub = QSub.sub;

        return queryFactory.select(qSub.minPrice.avg().round())
                .from(qSub)
                .where(qSub.day.between(20190701,20190731).and(qSub.kindName.eq(kindName)).and(qSub.productRank.eq(productRank).and(qSub.productClsName.eq(productClsName)))).fetchOne();
    }

    @Override
    public Double find8ByKeywordMin(String key, String kindName, String productRank, String productClsName) {
        QSub qSub = QSub.sub;

        return queryFactory.select(qSub.minPrice.avg().round())
                .from(qSub)
                .where(qSub.day.between(20190801,20190831).and(qSub.kindName.eq(kindName)).and(qSub.productRank.eq(productRank).and(qSub.productClsName.eq(productClsName)))).fetchOne();
    }

    @Override
    public Double find9ByKeywordMin(String key, String kindName, String productRank, String productClsName) {
        QSub qSub = QSub.sub;

        return queryFactory.select(qSub.minPrice.avg().round())
                .from(qSub)
                .where(qSub.day.between(20190901,20190930).and(qSub.kindName.eq(kindName)).and(qSub.productRank.eq(productRank).and(qSub.productClsName.eq(productClsName)))).fetchOne();
    }

    @Override
    public Double find10ByKeywordMin(String key, String kindName, String productRank, String productClsName) {
        QSub qSub = QSub.sub;

        return queryFactory.select(qSub.minPrice.avg().round())
                .from(qSub)
                .where(qSub.day.between(20191001,20191031).and(qSub.kindName.eq(kindName)).and(qSub.productRank.eq(productRank).and(qSub.productClsName.eq(productClsName)))).fetchOne();
    }

    @Override
    public Double find11ByKeywordMin(String key, String kindName, String productRank, String productClsName) {
        QSub qSub = QSub.sub;

        return queryFactory.select(qSub.minPrice.avg().round())
                .from(qSub)
                .where(qSub.day.between(20191101,20191130).and(qSub.kindName.eq(kindName)).and(qSub.productRank.eq(productRank).and(qSub.productClsName.eq(productClsName)))).fetchOne();
    }

    @Override
    public Double find1ByKeywordMax(String key, String kindName, String productRank, String productClsName) {
        QSub qSub = QSub.sub;

        return queryFactory.select(qSub.maxPrice.avg().round())
                .from(qSub)
                .where(qSub.day.between(20190102,20190131).and(qSub.kindName.eq(kindName)).and(qSub.productRank.eq(productRank).and(qSub.productClsName.eq(productClsName)))).fetchOne();
    }

    @Override
    public Double find2ByKeywordMax(String key, String kindName, String productRank, String productClsName) {
        QSub qSub = QSub.sub;

        return queryFactory.select(qSub.maxPrice.avg().round())
                .from(qSub)
                .where(qSub.day.between(20190201,20190228).and(qSub.kindName.eq(kindName)).and(qSub.productRank.eq(productRank).and(qSub.productClsName.eq(productClsName)))).fetchOne();
    }

    @Override
    public Double find3ByKeywordMax(String key, String kindName, String productRank, String productClsName) {
        QSub qSub = QSub.sub;

        return queryFactory.select(qSub.maxPrice.avg().round())
                .from(qSub)
                .where(qSub.day.between(20190301,20190331).and(qSub.kindName.eq(kindName)).and(qSub.productRank.eq(productRank).and(qSub.productClsName.eq(productClsName)))).fetchOne();
    }

    @Override
    public Double find4ByKeywordMax(String key, String kindName, String productRank, String productClsName) {
        QSub qSub = QSub.sub;

        return queryFactory.select(qSub.maxPrice.avg().round())
                .from(qSub)
                .where(qSub.day.between(20190401,20190430).and(qSub.kindName.eq(kindName)).and(qSub.productRank.eq(productRank).and(qSub.productClsName.eq(productClsName)))).fetchOne();
    }

    @Override
    public Double find5ByKeywordMax(String key, String kindName, String productRank, String productClsName) {
        QSub qSub = QSub.sub;

        return queryFactory.select(qSub.maxPrice.avg().round())
                .from(qSub)
                .where(qSub.day.between(20190501,20190531).and(qSub.kindName.eq(kindName)).and(qSub.productRank.eq(productRank).and(qSub.productClsName.eq(productClsName)))).fetchOne();
    }

    @Override
    public Double find6ByKeywordMax(String key, String kindName, String productRank, String productClsName) {
        QSub qSub = QSub.sub;

        return queryFactory.select(qSub.maxPrice.avg().round())
                .from(qSub)
                .where(qSub.day.between(20190601,20190630).and(qSub.kindName.eq(kindName)).and(qSub.productRank.eq(productRank).and(qSub.productClsName.eq(productClsName)))).fetchOne();
    }

    @Override
    public Double find7ByKeywordMax(String key, String kindName, String productRank, String productClsName) {
        QSub qSub = QSub.sub;

        return queryFactory.select(qSub.maxPrice.avg().round())
                .from(qSub)
                .where(qSub.day.between(20190701,20190731).and(qSub.kindName.eq(kindName)).and(qSub.productRank.eq(productRank).and(qSub.productClsName.eq(productClsName)))).fetchOne();
    }

    @Override
    public Double find8ByKeywordMax(String key, String kindName, String productRank, String productClsName) {
        QSub qSub = QSub.sub;

        return queryFactory.select(qSub.maxPrice.avg().round())
                .from(qSub)
                .where(qSub.day.between(20190801,20190831).and(qSub.kindName.eq(kindName)).and(qSub.productRank.eq(productRank).and(qSub.productClsName.eq(productClsName)))).fetchOne();
    }

    @Override
    public Double find9ByKeywordMax(String key, String kindName, String productRank, String productClsName) {
        QSub qSub = QSub.sub;

        return queryFactory.select(qSub.maxPrice.avg().round())
                .from(qSub)
                .where(qSub.day.between(20190901,20190930).and(qSub.kindName.eq(kindName)).and(qSub.productRank.eq(productRank).and(qSub.productClsName.eq(productClsName)))).fetchOne();
    }

    @Override
    public Double find10ByKeywordMax(String key, String kindName, String productRank, String productClsName) {
        QSub qSub = QSub.sub;

        return queryFactory.select(qSub.maxPrice.avg().round())
                .from(qSub)
                .where(qSub.day.between(20191001,20191031).and(qSub.kindName.eq(kindName)).and(qSub.productRank.eq(productRank).and(qSub.productClsName.eq(productClsName)))).fetchOne();
    }

    @Override
    public Double find11ByKeywordMax(String key, String kindName, String productRank, String productClsName) {
        QSub qSub = QSub.sub;

        return queryFactory.select(qSub.maxPrice.avg().round())
                .from(qSub)
                .where(qSub.day.between(20191101,20191130).and(qSub.kindName.eq(kindName)).and(qSub.productRank.eq(productRank).and(qSub.productClsName.eq(productClsName)))).fetchOne();
    }
}
