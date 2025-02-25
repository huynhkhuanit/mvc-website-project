# CÁCH CÀI ĐẶT JAVA + SPRING BOOT 🚀

> • Khi lập trình website với mô hình MVC (Model - View - Controller) có rất nhiều ngôn ngữ + framework có thể áp dụng và thực hiện 🚀

> • Thế nhưng mình sẽ sử dụng một ngôn ngữ dễ dàng + framework hỗ trợ mạnh mẽ thì mình đề xuất ngôn ngữ Java + Spring Boot thiết kế front-end sử dụng các thư viện (library) như: Tailwind, Boostrap và Thymeleaf để dựng phần front-end và back-end sử dụng Spring Boot ✅

> • Dưới đây là cách thực hiện mô hình MVC với Java Spring Boot. ⭐

---

## 1. Cài đặt Java JDK (JDK - 17 & JDK 21):

-   Các bạn lưu ý hiện tại có nhiều phiên bản **Java JDK** phổ biến:
    -   Java JDK - 23.
    -   Java JDK - 21.
    -   Java JDK - 17.
    -   Java JDK - 11.
-   ⚠️ **Lưu ý**: Thế nhưng ở đây mình sử dụng phiên bản Spring Boot 3.4.3 là phiên bản ổn định nhất. Chỉ hỗ trợ phiên bản Java JDK - 17 đến 21 thôi nhé!
-   ✅ **Cài đặt JDK 21**: https://download.oracle.com/java/21/latest/jdk-21_windows-x64_bin.exe
    -   Các bạn cài đặt như bình thường với file `.exe` nha.
        ![Hình ảnh 2](./resources/image%20copy%202.png)
-   ✅ **Cài đặt Maven (bin)**: https://dlcdn.apache.org/maven/maven-3/3.9.9/binaries/apache-maven-3.9.9-bin.zip
    -   Các bạn cài đặt file `.zip` sau đó giải nén ra nhé!
    -   Sau khi giải nén ra các bạn copy cho mình vào đường dẫn: `C:\Program Files\maven`.
        -   Bạn nếu vào `Program Files` mà không thấy maven (hoặc thư mục apache) thì các bạn tự tạo thêm nhé! Như đối với `JavaFX` thôi!
            ![Hình ảnh 1](./resources/image%20copy.png)
        -   Như hình là **OK** rồi các bạn nhé!

## 2. Setup môi trường (Environment PATH):

-   Ấn nút Windows trên bàn phím > Tìm kiếm: **Edit the system environment variables** > Chọn **environment variable**
    ![Hình ảnh 3](./resources/image%20copy%203.png)

-   Các bạn ấn vào **New** để tạo **variables** cho môi trường (PATH) nhé!
    ![Hình ảnh 4](./resources/image%20copy%204.png)

-   Các bạn đặt tên **Name** và **Value** nhé!
    ![Hình ảnh 5](./resources/image%20copy%205.png)

-   Tương tự như **JAVA_HOME** các bạn thêm cho mình **MAVEN_HOME** nha!
    ![Hình ảnh 6](./resources/image%20copy%206.png)

> ⚠️ Các bạn lưu ý là các đường dẫn phải đúng nha!

-   Sau khi **setup môi trường** xong > Bật **CMD (Command Prompt)** để **test** các **variables**.
    ![Hình ảnh 7](./resources/image%20copy%207.png)
-   Nếu hiển thị đúng như hình là thành công các bạn nhé!

-   Tiếp tục setup **PATH** cho **JAVA** và **MAVEN** (các bạn là như hình):
    ![Hình ảnh 8](./resources/image%20copy%208.png)

-   Các bạn gõ vào như hình đã thực hiện nhé > Ấn **OK**
    ![Hình ảnh 9](./resources/image%20copy%209.png)

-   Bật **CMD** và kiểm tra (như hình là đúng):
    ![Hình ảnh 10](./resources/image%20copy%2010.png)

> ⚠️ Lưu ý: Nhưng vẫn có lôi xảy ra mặc dù bạn đã thêm bin của **jdk - 21** nhưng vẫn nhận **jdk - 23** đã cài đặt trước đó. Có vẻ có một vấn đề đè lên các thư mục **bin**.
> ![Hình ảnh 11](./resources/image%20copy%2011.png)

> 🚨 Các bạn còn nhớ khi setup **PATH** có một đường dân **PATH** như sau:
> ![Hình ảnh 9](./resources/image%20copy%209.png)

> 🚨 Các bạn để ý đường dẫn Oracle của Java trên cùng nhé! Nó lưu trữ JDK hiện tại là 23 cho nên gây ra lỗi hiện tại! Cùng fix nào ✅

> 🚀 Chỉ cần **MOVE UP** **`%JAVA_HOME%\bin`** lên cao hơn Oracle của Java là được nhé!
> ![Hình ảnh 12](./resources/image%20copy%2012.png)

-   **Kết quả**:
    ![Hình ảnh 13](./resources/image%20copy%2013.png)

-   Vậy là **setup môi trường (environment PATH)** thành công rồi nhé!

## 3. Cài đặt VS Code và các extension:

1. Đường dẫn cài đặt **VS Code**: https://code.visualstudio.com/docs/?dv=win64user

2. Các **extension** cần có:
    - **Java Extension Pack**: Bộ công cụ cơ bản cho Java (bao gồm hỗ trợ debug, test, và IntelliSense).
    - **Spring Boot Extension Pack**: Bao gồm:
        - **Spring Boot Tools**: Hỗ trợ cấu hình Spring Boot, gợi ý cú pháp trong file application.properties hoặc application.yml.
        - **Spring Initializr Java Support**: Giúp tạo dự án Spring Boot ngay trong VS Code.
        - **Spring Boot Dashboard**: Quản lý và chạy ứng dụng Spring Boot dễ dàng.
    - **Lombok Annotations Support for VS Code**: Nếu bạn dùng Lombok để giảm boilerplate code (như getter/setter), hãy cài extension này.
    - **Maven for Java**: Hỗ trợ quản lý dependencies và build dự án bằng Maven.
    - **Debugger for Java**: Debug code dễ dàng hơn.

> 💡 Các Extension ở trên đủ sức để các bạn thoải mái triển khai Java Spring Boot nha!

## 4. Tạo dự án Spring Boot với MVC

1. **Tạo dự án**:

    - Mở VS Code, nhấn **Ctrl+Shift+P (Command Palette)**, gõ "`Spring Initializr: Create a Maven Project`".
    - Các bạn chọn **phiên bản 3.4.3**:
      ![Hình ảnh 14](./resources/image%20copy%2014.png)
    - Chọn ngôn ngữ **Java**.
    - Nhập **Group ID** (ví dụ: `com.yourname`) và **Artifact ID** (ví dụ: `website`).
    - Phần **packing type** các bạn chọn `JAR` nha.
      ![Hình ảnh 15](./resources/image%20copy%2015.png)
    - Phiên bản **Java** chọn **21**.
    - Chọn **dependencies**:
        - **Spring Web**: Để xây dựng ứng dụng web MVC.
        - **Thymeleaf**: Template engine cho View.
        - **Spring Data JPA (tùy chọn)**: Nếu bạn cần kết nối cơ sở dữ liệu.
        - **H2 Database (tùy chọn)**: Dùng thử cơ sở dữ liệu in-memory.
    - Chọn thư mục lưu:
      ![Hình ảnh 16](./resources/image%20copy%2016.png)
    - Các bạn thu được cấu trúc thư mục như hình:
      ![Hình ảnh 17](./resources/image%20copy%2017.png)

2. **Cấu trúc thư mục**:

    - **`src/main/java`**: Chứa code Java (Controller, Model, Service...).
    - **`src/main/resources`**: Chứa file cấu hình (application.properties) và template (templates/ cho Thymeleaf).
    - **`src/test`**: Chứa code test.

3. **Setup môi trường tối ưu**:
    - File **application.properties**: Thêm cấu hình cơ bản, ví dụ:

```text
spring.thymeleaf.cache=false  # Tắt cache để dễ debug giao diện
server.port=8080              # Cổng chạy ứng dụng
```

4. **Cấu hình dự án (MVC)**:

    - **Model**:
        - Tạo class **User** trong **src/main/java/com/yourname/website/model**:

    ```java
        public class User {
            private Long id;
            private String name;

            // Getter, Setter (hoặc dùng Lombok: @Getter @Setter)
        }
    ```

    - **Controller**:

        - Tạo class **UserController** trong **src/main/java/com/yourname/website/controller**

    - **View**:

        - Tạo file **users.html** trong **src/main/resources/templates**:

        ```html
        <!DOCTYPE html>
        <html xmlns:th="http://www.thymeleaf.org">
            <head>
                <title>Website MVC</title>
            </head>
            <body>
                <h1 th:text="${message}"></h1>
            </body>
        </html>
        ```

    - **Chạy thử**: Chạy `mvn spring-boot:run`, mở trình duyệt vào localhost:8080/users. Bạn sẽ thấy dòng "Huỳnh Khuân IT đã thực hiện!".

- Sau khi thành công bạn sẽ truy cập được như hình:
![Hình ảnh 19](./resources/image%20copy%2019.png)

## 5. KẾT LUẬN

- Trên đây là cách thực hiện chi tiết hết sức có thể mà mình đã hướng dẫn. Mong rằng các bạn sẽ thực hiện được.
- Cám ơn các bạn đã theo dõi và ủng hộ mình bằng cách ấn `Follow` cho mình nhé!
- Và mình là **huynhkhuanit**, một kẻ tìm niềm vui trong từng dòng **code**!
- Nếu gặp bất kỳ vấn đề nào, các bạn liên hệ với mình qua các thông tin liên hệ sau:

- **Thông tin liên hệ**:
    - 📧 **Email**: huynhkhuanit@gmail.com | huynhkhuan777@gmail.com | huynhkhuanit.dev@gmail.com
    - 📱 **Phone**: 0943006018 (zalo) | 0898094706.

---