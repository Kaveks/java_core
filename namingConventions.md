# Java Naming Conventions

Java has established naming conventions that make code easier to read, maintain, and understand.

These are **conventions**, not generally compiler-enforced rules. Java will usually compile code that violates them, but following the conventions makes your code look and behave like standard Java code.

---

## 1. General Rule

Java commonly uses:

- **PascalCase** for classes, interfaces, enums, and records
- **camelCase** for variables, methods, and parameters
- **UPPER_SNAKE_CASE** for constants
- Package names are written in **lowercase**

Example:

```java
public class PaymentService {

    private String customerName;

    public void processPayment() {
        // ...
    }
}
```

---

# 2. Classes

Class names should use **PascalCase**.

Each word starts with a capital letter.

### Correct

```java
class Customer {
}

class BankAccount {
}

class PaymentService {
}

class TransactionProcessor {
}
```

### Incorrect

```java
class customer {
}

class bankaccount {
}

class payment_service {
}

class transaction_processor {
}
```

### Rule

```text
ClassName
BankAccount
PaymentService
TransactionProcessor
```

Think:

```text
FirstWord + SecondWord + ThirdWord
    ↓          ↓          ↓
  Upper      Upper      Upper
```

---

# 3. Interfaces

Interface names also use **PascalCase**.

```java
interface PaymentProcessor {
}

interface UserRepository {
}

interface NotificationService {
}
```

An interface represents a contract or capability.

For example:

```java
interface PaymentProcessor {

    void processPayment();
}
```

A class can implement the interface:

```java
class MpesaPaymentProcessor implements PaymentProcessor {

    public void processPayment() {
        System.out.println("Processing M-Pesa payment");
    }
}
```

Notice both names use PascalCase:

```java
PaymentProcessor
MpesaPaymentProcessor
```

### Interface naming

Do not automatically add `Interface` to the name.

Prefer:

```java
interface PaymentProcessor
```

instead of:

```java
interface PaymentProcessorInterface
```

The name should describe what the interface represents.

---

# 4. Variables

Variables use **camelCase**.

The first word starts with lowercase.

Every following word starts with an uppercase letter.

```java
String customerName;
int accountNumber;
double accountBalance;
boolean paymentSuccessful;
```

Example:

```java
String firstName;
String lastName;
int transactionCount;
double transactionAmount;
```

### Incorrect

```java
String CustomerName;
String customer_name;
String customername;
```

### Correct

```java
String customerName;
```

---

# 5. Method Names

Methods also use **camelCase**.

```java
public void processPayment() {
}

public void calculateBalance() {
}

public String getCustomerName() {
}

public void updateAccountStatus() {
}
```

The method name should generally describe an **action**.

Examples:

```text
calculateBalance()
processPayment()
createAccount()
deleteUser()
sendNotification()
validateTransaction()
```

---

# 6. Method Parameters

Method parameters use camelCase.

```java
public void createAccount(String customerName, double initialBalance) {
}
```

Here:

```text
customerName
initialBalance
```

are parameters.

Another example:

```java
public void transferMoney(
        String sourceAccount,
        String destinationAccount,
        double amount) {
}
```

---

# 7. Constants

Constants use **UPPER_SNAKE_CASE**.

Words are separated by underscores.

```java
public static final int MAX_RETRIES = 3;

public static final double TAX_RATE = 0.16;

public static final String DEFAULT_CURRENCY = "KES";
```

Example:

```java
class PaymentConfiguration {

    public static final int MAX_RETRIES = 3;
    public static final int TIMEOUT_SECONDS = 30;
}
```

The conventional pattern is:

```text
UPPERCASE_WORDS_SEPARATED_BY_UNDERSCORES
```

---

# 8. Instance Variables

Instance variables use camelCase.

```java
class Customer {

    String firstName;
    String lastName;
    String phoneNumber;
    String emailAddress;
}
```

Notice:

```java
firstName
lastName
phoneNumber
emailAddress
```

not:

```java
FirstName
first_name
```

---

# 9. Private Variables

Private variables follow the same camelCase convention.

```java
class BankAccount {

    private String accountNumber;
    private double accountBalance;
}
```

Java does not normally use a special prefix such as `_` for private fields.

Prefer:

```java
private String customerName;
```

rather than:

```java
private String _customerName;
```

---

# 10. Boolean Variables

Boolean variables should usually read naturally as a question or state.

Good examples:

```java
boolean active;
boolean enabled;
boolean verified;
boolean paymentSuccessful;
boolean accountClosed;
```

Prefixes such as `is`, `has`, or `can` are also common:

```java
boolean isActive;
boolean hasBalance;
boolean canWithdraw;
```

For methods, Java commonly uses:

```java
isActive()
hasBalance()
canWithdraw()
```

For example:

```java
public boolean isActive() {
    return active;
}
```

---

# 11. Packages

Package names are normally written entirely in lowercase.

```java
package com.example.payment;
```

Multiple words are not separated with camelCase.

Prefer:

```text
com.example.paymentservice
```

or:

```text
com.example.payment.service
```

rather than:

```text
com.example.paymentService
```

A common structure is:

```text
com.company.application.feature
```

For example:

```java
package com.syndicatedpayments.payment.service;
```

---

# 12. Enums

Enum type names use PascalCase.

```java
enum PaymentStatus {
}
```

The enum constants normally use **UPPER_SNAKE_CASE**.

```java
enum PaymentStatus {

    PENDING,
    COMPLETED,
    FAILED,
    CANCELLED
}
```

Example:

```java
PaymentStatus status = PaymentStatus.PENDING;
```

---

# 13. Records

Records use PascalCase just like classes.

```java
public record Customer(
        String name,
        String email,
        String phoneNumber
) {
}
```

The record name:

```text
Customer
```

uses PascalCase.

The components:

```text
name
email
phoneNumber
```

use camelCase.

---

# 14. Generic Type Parameters

Generic type parameters traditionally use a single uppercase letter when the meaning is obvious.

Common conventions include:

```java
T
E
K
V
N
```

Examples:

```java
T
```

means a general type.

```java
E
```

usually means an element.

```java
K
```

usually means a key.

```java
V
```

usually means a value.

For example:

```java
class Box<T> {

    private T value;

    public Box(T value) {
        this.value = value;
    }
}
```

For a map:

```java
Map<K, V>
```

means:

```text
K = Key
V = Value
```

---

# 15. File Names

For a public class, the file name must match the class name.

If you have:

```java
public class PaymentService {
}
```

the file should be:

```text
PaymentService.java
```

For:

```java
public class BankAccount {
}
```

the file should be:

```text
BankAccount.java
```

This is more than a convention. For a public top-level class, Java requires the filename to match the class name.

---

# 16. Complete Example

Putting the conventions together:

```java
package com.example.payment;

public class PaymentService {

    private static final int MAX_RETRIES = 3;

    private String customerName;
    private double paymentAmount;
    private boolean paymentSuccessful;

    public PaymentService(
            String customerName,
            double paymentAmount) {

        this.customerName = customerName;
        this.paymentAmount = paymentAmount;
    }

    public void processPayment() {
        System.out.println(
                "Processing payment for " + customerName
        );
    }

    public boolean isPaymentSuccessful() {
        return paymentSuccessful;
    }
}
```

Notice the naming:

```text
PaymentService
    ↓
Class → PascalCase

MAX_RETRIES
    ↓
Constant → UPPER_SNAKE_CASE

customerName
paymentAmount
paymentSuccessful
    ↓
Variables → camelCase

processPayment()
isPaymentSuccessful()
    ↓
Methods → camelCase

com.example.payment
    ↓
Package → lowercase
```

---

# 17. Quick Reference

| Java element      | Convention       | Example               |
| ----------------- | ---------------- | --------------------- |
| Class             | PascalCase       | `PaymentService`      |
| Interface         | PascalCase       | `PaymentProcessor`    |
| Enum              | PascalCase       | `PaymentStatus`       |
| Record            | PascalCase       | `Customer`            |
| Variable          | camelCase        | `customerName`        |
| Instance variable | camelCase        | `accountBalance`      |
| Parameter         | camelCase        | `paymentAmount`       |
| Method            | camelCase        | `processPayment()`    |
| Constant          | UPPER_SNAKE_CASE | `MAX_RETRIES`         |
| Enum constant     | UPPER_SNAKE_CASE | `COMPLETED`           |
| Package           | lowercase        | `com.example.payment` |
| Generic type      | Uppercase        | `T`, `K`, `V`         |
| Public class file | ClassName.java   | `PaymentService.java` |

---

# 18. The Main Rules to Remember

If you remember only these rules:

```text
Classes       → PascalCase
Interfaces    → PascalCase
Enums         → PascalCase
Records       → PascalCase

Variables     → camelCase
Methods       → camelCase
Parameters    → camelCase

Constants     → UPPER_SNAKE_CASE
Enum values   → UPPER_SNAKE_CASE

Packages      → lowercase
```

Example:

```java
public class PaymentProcessor {

    private static final int MAX_RETRIES = 3;

    private String customerName;

    public void processPayment(String paymentReference) {
        // ...
    }
}
```

This is idiomatic Java naming.
