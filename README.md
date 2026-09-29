# Bài tập SOLID

## 1. SRP (Single Responsibility Principle)
Mỗi lớp chỉ nên đảm nhận một trách nhiệm rõ ràng:
- `Invoice`: quản lý dữ liệu và tính toán hóa đơn
- `InvoiceHtmlFormatter`: định dạng HTML
- `InvoiceRepository`: lưu trữ dữ liệu
- `InvoiceEmailSender`: gửi email

## 2. OCP (Open/Closed Principle)
Một class nên mở cho việc mở rộng, đóng cho việc sửa đổi:
- Dùng interface `DiscountStrategy`
- Thêm chiến lược mới bằng cách tạo class mới thay vì sửa logic cũ

## 3. LSP (Liskov Substitution Principle)
Class con phải có thể thay thế class cha mà không làm sai hành vi của chương trình:
- `Square` không kế thừa từ `Rectangle` trong ví dụ này để tránh vi phạm hợp đồng

## 4. ISP (Interface Segregation Principle)
Không ép class phải implement các method không cần thiết:
- Tách `Switchable`, `VolumeAdjustable`, `TemperatureAdjustable`

## 5. DIP (Dependency Inversion Principle)
Các lớp cấp cao không nên phụ thuộc trực tiếp vào lớp cụ thể:
- `SmartSwitchController` phụ thuộc vào abstraction `Switchable`

## Cách chạy
```bash
cd C:\SOLID
javac -d out $(find src -name "*.java")
java -cp out lab_solid.srp.MainSRP
java -cp out lab_solid.ocp.MainOCP
java -cp out lab_solid.lsp.MainLSP
java -cp out lab_solid.isp_dip.MainISPDIP
```
