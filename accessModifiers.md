# Java Access Modifiers and Packages

## 1. What Are Access Modifiers?

Access modifiers control the visibility of Java classes, methods, constructors, and variables.

Java has four access levels:

- `public`
- `protected`
- Package-private, meaning no modifier is specified
- `private`

They determine where a class or its members can be accessed.

## 2. Access Modifier Summary

| Access modifier | Same class | Same package | Subclass in another package       | Unrelated class in another package |
| --------------- | ---------- | ------------ | --------------------------------- | ---------------------------------- |
| `public`        | Yes        | Yes          | Yes                               | Yes                                |
| `protected`     | Yes        | Yes          | Yes, subject to inheritance rules | No                                 |
| Package-private | Yes        | Yes          | No                                | No                                 |
| `private`       | Yes        | No           | No                                | No                                 |

Remember the general progression from most restrictive to least restrictive:

```text
private
   ↓
package-private
   ↓
protected
   ↓
public
```

`protected` has special rules for subclasses accessing members across package boundaries.

---

## 3. Understanding Packages

A package groups related Java classes and interfaces. Packages help organize code and determine package-level access.

Example project structure:

```text
src/
└── com/
    └── example/
        ├── models/
        │   └── BankAccount.java
        ├── services/
        │   └── AccountService.java
        └── Main.java
```

The `BankAccount.java` file might begin with:

```java
package com.example.models;
```

The `AccountService.java` file might begin with:

```java
package com.example.services;
```

These are different packages.

Sharing the prefix `com.example` does not make them the same package.

### Importing a class

```java
import com.example.models.BankAccount;
```

An import makes an accessible type available by its simple name. It does not bypass access restrictions.

---

## 4. Public Access Modifier

The `public` modifier makes a class or member accessible from other packages, provided the containing type is accessible.

```java
package com.example.models;

public class BankAccount {

    public String accountNumber = "ACC001";

    public void displayAccount() {
        System.out.println(accountNumber);
    }
}
```

Another package can use it:

```java
package com.example.services;

import com.example.models.BankAccount;

public class AccountService {

    public void display() {
        BankAccount account = new BankAccount();

        System.out.println(account.accountNumber);
        account.displayAccount();
    }
}
```

Both the class and its members are accessible here.

**Important:** A public member inside an inaccessible class does not become accessible from everywhere just because the member is public.

---

## 5. Private Access Modifier

The `private` modifier restricts access to the declaring class.

```java
public class BankAccount {

    private double balance = 1000;

    public double getBalance() {
        return balance;
    }
}
```

This works:

```java
BankAccount account = new BankAccount();

System.out.println(account.getBalance());
```

This does not work:

```java
System.out.println(account.balance);
```

The second statement causes a compilation error because `balance` is private.

However, methods inside `BankAccount` can access `balance`.

### Why use private?

Private members support **encapsulation**. They allow a class to control how its internal state is accessed or modified.

For example, a bank account can expose a deposit method instead of allowing arbitrary code to modify its balance directly.

---

## 6. Package-Private Access

Package-private access is the default when no access modifier is specified.

```java
package com.example.models;

class InternalAccount {

    String accountNumber = "ACC001";

    void displayAccount() {
        System.out.println(accountNumber);
    }
}
```

The class and its members can be accessed by eligible code in the same package.

They cannot be accessed directly from an unrelated class in another package.

### Important distinction

Package-private does not mean private to the file.

Other classes in the same package can access package-private members, subject to the normal Java rules.

---

## 7. Protected Access Modifier

The `protected` modifier allows access within the declaring package and access by subclasses in other packages, subject to Java's inheritance rules.

Parent class:

```java
package com.example.models;

public class BankAccount {

    protected double balance = 1000;

    protected void displayBalance() {
        System.out.println(balance);
    }
}
```

Child class in another package:

```java
package com.example.services;

import com.example.models.BankAccount;

public class SavingsAccount extends BankAccount {

    public void showBalance() {
        System.out.println(balance);

        displayBalance();
    }
}
```

This works because `SavingsAccount` extends `BankAccount`.

However, `protected` does not give every unrelated class in `com.example.services` access to those members.

Across package boundaries, access to protected instance members is governed by additional inheritance rules. A subclass cannot freely access a protected instance member through an arbitrary reference to a parent-class object.

### Remember

- Same package: protected members are accessible.
- Different package: subclasses can access them under the inheritance rules.
- Unrelated class in another package: access is not permitted.

---

## 8. Access Modifiers on Classes

For top-level classes, Java allows only `public` or package-private access.

Public class:

```java
public class Customer {
}
```

Package-private class:

```java
class InternalCustomer {
}
```

A top-level class cannot be declared `private` or `protected`.

| Declaration             | Visibility                     |
| ----------------------- | ------------------------------ |
| `public class Customer` | Accessible from other packages |
| `class Customer`        | Accessible within its package  |

Nested classes can use all four access levels.

---

## 9. Access Modifiers on Variables and Methods

Consider:

```java
public class BankAccount {

    public String accountType;
    protected double balance;
    String branchCode;
    private String pin;

    public void displayAccountType() {
        System.out.println(accountType);
    }

    protected void deposit(double amount) {
        balance += amount;
    }

    void displayBranchCode() {
        System.out.println(branchCode);
    }

    private boolean validatePin(String suppliedPin) {
        return pin.equals(suppliedPin);
    }
}
```

The members have different visibility:

| Member                 | Modifier    | Access                               |
| ---------------------- | ----------- | ------------------------------------ |
| `accountType`          | `public`    | Wherever the class is accessible     |
| `balance`              | `protected` | Same package and eligible subclasses |
| `branchCode`           | None        | Same package                         |
| `pin`                  | `private`   | Declaring class only                 |
| `displayAccountType()` | `public`    | Wherever the class is accessible     |
| `deposit()`            | `protected` | Same package and eligible subclasses |
| `displayBranchCode()`  | None        | Same package                         |
| `validatePin()`        | `private`   | Declaring class only                 |

The same access rules apply to fields and methods.

---

## 10. Access Modifiers on Constructors

Constructors can also have access modifiers.

```java
public class BankAccount {

    public BankAccount() {
    }
}
```

This allows accessible code to create an instance using `new BankAccount()`.

A private constructor:

```java
public class Utility {

    private Utility() {
    }
}
```

prevents ordinary construction from outside the declaring class.

Private constructors are useful for some utility classes and controlled object-creation patterns.

---

## 11. Access Modifiers and Inheritance

Consider:

```java
class Person {

    public String name;
    protected int age;
    String address;
    private String nationalId;
}
```

A child class can inherit from `Person`:

```java
class Employee extends Person {

    public void display() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(address);
    }
}
```

Because both classes are in the same package, the child can access the public, protected, and package-private fields.

It cannot directly access `nationalId`, because that field is private.

**Important:** Private members are not directly accessible by a subclass, although the parent object still contains its private state and the parent class can provide methods to access or modify it.

---

## 12. Practical Example: Payment Application

Imagine this structure:

```text
com.syndikiza.payment
├── model
│   └── Payment.java
├── service
│   └── PaymentService.java
└── controller
    └── PaymentController.java
```

A `Payment` class might look like this:

```java
package com.syndikiza.payment.model;

public class Payment {

    private String reference;
    private double amount;

    public Payment(String reference, double amount) {
        this.reference = reference;
        this.amount = amount;
    }

    public String getReference() {
        return reference;
    }

    public double getAmount() {
        return amount;
    }
}
```

Here:

- `Payment` is public so other packages can use the type.
- `reference` and `amount` are private to protect the object's internal state.
- The constructor is public so accessible code can create payments.
- Getter methods provide controlled access to the values.

This is a common approach in Java applications.

---

## 13. Best Practices

1. Use `private` for internal fields unless wider access is necessary.
2. Use `public` for the methods and types that form your intended API.
3. Use package-private access for implementation details that only need to be shared within a package.
4. Use `protected` when subclass access is an intentional part of the design.
5. Do not assume an `import` statement grants access to an otherwise inaccessible class or member.
6. Use access modifiers to support encapsulation, but do not treat them as a substitute for application security or authorization.

---

## 14. Quick Reference

```text
public
    Accessible wherever the containing type permits access.

protected
    Accessible within the package and to eligible subclasses.

package-private
    Accessible within the same package.

private
    Accessible within the declaring class.
```

### Final mental model

Access modifiers define the boundaries of your Java code.

Packages organize classes. Access modifiers control which classes can use those types and members. Inheritance adds special access rules for subclasses.

**The guiding principle: expose only what other code needs, and keep implementation details as restricted as practical.**
