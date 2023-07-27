# Stocks
Stocks is a android applications that displays latest stock market Summary and receive notification from firebase cloud

<img src="https://github.com/yowee/Stocks/assets/14086636/66b560c0-538c-454f-9034-734e2c94ca2d" width="340"/>



## Usage 
Generate new token from yahoo finance [Yahoo Finance](https://rapidapi.com/apidojo/api/yh-finance/)
```java
    const val BASE_URL = "https://yh-finance.p.rapidapi.com"
    const val SUMMARY_END_POINT = "/market/v2/get-summary"
    const val X_RAPID_AUTH_HEADER_KEY = "X-RapidAPI-Key"
    const val X_RapidAPI_Key = "99a4a73f35mshf573f9010bbd471p11c740jsnb30186cbb1e0"
    const val X_RapidAPI_Host = "yh-finance.p.rapidapi.com"
    const val X_RapidAPI_Header_Host = "X-RapidAPI-Host"
```
## Installation

[Clone Stocks](https://github.com/yowee/Stocks) and open run it in your ide


## Permissions


```java
Internet
Notification
```



# Features
Signnup with Email and password

SignIn with Email and password

Social Login(Facebook and Google)

# Architecture **"MVVM"**
Dipendency Injection

Repository

ViewModel

# Libraries

Compose

Retorfit

HILT

Gson

Mockito

Firebase

# API

Rooms: https://yh-finance.p.rapidapi.com/market/v2/get-summary


People: https://61e947967bc0550017bc61bf.mockapi.io/api/v1/people
