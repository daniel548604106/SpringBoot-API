package com.example.studentsystem.repository;

import com.example.studentsystem.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


// Repository 即資料倉儲的意思。 Repository is naming convention that access the database
// Repository居於業務層和資料層之間，將兩者隔離開來，在它的內部封裝了資料查詢和儲存的邏輯
// 不要懷疑，就只是宣告一個 Interface 而已，而且是空的；
// 至於加入 @Repository("PersonSpringDataJPADao") 只是讓 Control 層也能直接引用。




// 此註解有自動翻譯的特性，例如：當此種component丟擲了一個異常，那麼會有一個handler來處理此異常，無需使用try-catch塊。

// 2 Parameters in Generics
// 1st Parameter - The type of Object that we want to work with
// 2nd Parameter - The type of ID

// This interface is in charge of accessing the database.


// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
@Repository // 此類使用在class上宣告此類用於訪問資料庫，一般作為DAO的角色。
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
