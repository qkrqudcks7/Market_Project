package project.traditionalmarket.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;
import project.traditionalmarket.domain.Main;
import project.traditionalmarket.domain.Sub;

import java.util.Optional;

@Transactional(readOnly = true)
public interface MainRepository extends JpaRepository<Main,Long>,MainRepositoryExtension {
    Page<Main> findByKeyword(String keyword, String nation, Pageable pageable,String priority1,String prioirty2,String priority3);

    Page<Main> findMainByKeyword(String keyword,Pageable pageable);

    Page<Sub> findSubByKeyword(String keyword, Pageable pageable);

    Page<Main> findMainByKeyword2(String keyword,Pageable pageable,String priority);

    Optional<Main> findById(Long id);

    Double find1ByKeword(String key,String market);
    Double find2ByKeword(String key,String market);
    Double find3ByKeword(String key,String market);
    Double find4ByKeword(String key,String market);
    Double find5ByKeword(String key,String market);
    Double find6ByKeword(String key,String market);
    Double find7ByKeword(String key,String market);
    Double find8ByKeword(String key,String market);
    Double find9ByKeword(String key,String market);
    Double find10ByKeword(String key,String market);
    Double find11ByKeword(String key,String market);

    Double find1ByKeyword(String key, String kindName, String productRank, String productClsName);
    Double find2ByKeyword(String key, String kindName, String productRank, String productClsName);
    Double find3ByKeyword(String key, String kindName, String productRank, String productClsName);
    Double find4ByKeyword(String key, String kindName, String productRank, String productClsName);
    Double find5ByKeyword(String key, String kindName, String productRank, String productClsName);
    Double find6ByKeyword(String key, String kindName, String productRank, String productClsName);
    Double find7ByKeyword(String key, String kindName, String productRank, String productClsName);
    Double find8ByKeyword(String key, String kindName, String productRank, String productClsName);
    Double find9ByKeyword(String key, String kindName, String productRank, String productClsName);
    Double find10ByKeyword(String key, String kindName, String productRank, String productClsName);
    Double find11ByKeyword(String key, String kindName, String productRank, String productClsName);

    Double find1ByKeywordMin(String key, String kindName, String productRank, String productClsName);
    Double find2ByKeywordMin(String key, String kindName, String productRank, String productClsName);
    Double find3ByKeywordMin(String key, String kindName, String productRank, String productClsName);
    Double find4ByKeywordMin(String key, String kindName, String productRank, String productClsName);
    Double find5ByKeywordMin(String key, String kindName, String productRank, String productClsName);
    Double find6ByKeywordMin(String key, String kindName, String productRank, String productClsName);
    Double find7ByKeywordMin(String key, String kindName, String productRank, String productClsName);
    Double find8ByKeywordMin(String key, String kindName, String productRank, String productClsName);
    Double find9ByKeywordMin(String key, String kindName, String productRank, String productClsName);
    Double find10ByKeywordMin(String key, String kindName, String productRank, String productClsName);
    Double find11ByKeywordMin(String key, String kindName, String productRank, String productClsName);

    Double find1ByKeywordMax(String key, String kindName, String productRank, String productClsName);
    Double find2ByKeywordMax(String key, String kindName, String productRank, String productClsName);
    Double find3ByKeywordMax(String key, String kindName, String productRank, String productClsName);
    Double find4ByKeywordMax(String key, String kindName, String productRank, String productClsName);
    Double find5ByKeywordMax(String key, String kindName, String productRank, String productClsName);
    Double find6ByKeywordMax(String key, String kindName, String productRank, String productClsName);
    Double find7ByKeywordMax(String key, String kindName, String productRank, String productClsName);
    Double find8ByKeywordMax(String key, String kindName, String productRank, String productClsName);
    Double find9ByKeywordMax(String key, String kindName, String productRank, String productClsName);
    Double find10ByKeywordMax(String key, String kindName, String productRank, String productClsName);
    Double find11ByKeywordMax(String key, String kindName, String productRank, String productClsName);
}
