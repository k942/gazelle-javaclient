# gazelle-javaclient

gazelle-javaclient is a Java client implementation for the [Gazelle JSON-API](https://github.com/WhatCD/Gazelle/wiki/JSON-API-Documentation)

Features:
- Fully SSL 
- Enforce the "no more than five (5) requests every ten (10) seconds" rule

Technology aspects:
- Maven
- Java 7
- Exploits [JAX-RS Client API](https://jersey.java.net/documentation/2.17/client.html)
- Exploits [Jackson 2.x](https://jersey.java.net/documentation/2.17/media.html)

## Roadmap (TODOs)
- Cover all API features
- Intuitive Java API to access JSON-API features

## Usage example
```Java
String gazelleUrl = "https://ssl.foo.de";
String username = "User";
String password = "Password";

GazelleClient gClient = GazelleClient.newInstance(gazelleUrl, username, password);

// The requests will pause a moment after the first five in order to enforce the limit
for (int i = 0; i < 10; i++) {
	Index idx = gClient.request("index", Index.class);
	System.out.println(idx);
}
```

## Comparison with others Gazelle Java implementations

### [Gwindow/WhatAPI](https://github.com/Gwindow/WhatAPI)
- Better coverage of API features
- Include code to access third party services

