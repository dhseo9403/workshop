package com.test.myapp4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 1. 도메인에 대한 이해
// 2. 엔터티에 구분
// Library -> books, authors, members, loans
// 3. 엔터티간의 관계
// 책은 작가가 쓴다.
// 고객은 책을 빌린다.
// 고객은 대출해서 빌릴 수 있다.
// 4. 리소스에 대한 정의
// /books, /authors, /members, ...
// 5. Rest API 설계
// 동사는 안되고 명사형으로
// /getBook -> GET /books
// /createBook -> POST /books
// /getAllOrders -> GET /orders
// /updateEmployee -> PUT /employees/1
// /employees?employeeId=45 -> GET /employees/45
// 6. /authors/{author id}/books..
// /users/1234/orders
// 7. Filters, Sorts, Pagination
// /books?author=Rowlings&sort=title
//
// books/api/v1/
// GET /books
// POST /books
// Get /books/{book id}
// PUT /books/{book id}
// DELETE /books/{books id}

@SpringBootApplication
public class Myapp4Application {

	public static void main(String[] args) {
		SpringApplication.run(Myapp4Application.class, args);
	}

}
