# gazelle-javaclient

[![Build Status](https://snap-ci.com/k942/gazelle-javaclient/branch/master/build_image)](https://snap-ci.com/k942/gazelle-javaclient/branch/master)

gazelle-javaclient is a Java client for the [Gazelle JSON-API](https://github.com/WhatCD/Gazelle/wiki/JSON-API-Documentation)

Features:
- Fully SSL 
- Enforce the "no more than five (5) requests every ten (10) seconds" rule

Technology aspects:
- Maven
- Java 8
- [JAX-RS Client API](https://jersey.java.net/documentation/2.17/client.html)
- [Jackson 2.x](https://jersey.java.net/documentation/2.17/media.html)
- Client testing by mocking API with [Jersey test framework](https://jersey.java.net/documentation/2.17/test-framework.html)

## Roadmap (TODOs)
- Cover all API features
- Intuitive Java API to access JSON-API features
- Full testing of client against mocked API during maven build

## Usage example
```Java
String gazelleUrl = "https://ssl.foo.de";
String username = "User";
String password = "Password";

// Setup a client
GazelleClient gClient = GazelleClient.newInstance(WCD, username, password);
gClient.enforce(WhatcdRequestPolicy.INSTANCE);

// Retrieve the entry point to access resources
GazelleResources gazlRsrc = gClient.getResources();

// Index
Index idx = gazlRsrc.index().get();

// User profile
Userprofile userProfile = gazlRsrc.userProfile().get(idx.getId());

// Messages
Messages messages = gazlRsrc.messages().get();

MessagesResourceArgs msgArgs = new MessagesResourceArgs().setType(BoxType.SENTBOX)
      .setSort(SortType.UNREAD_FIRST);
Messages messagesSentBox = gazlRsrc.messages().get(msgArgs);

// Conversation
Long convId = messagesSentBox.getMessages().stream().findFirst().get().getConvId();
ConversationMessages convMsg = gazlRsrc.conversations().get(convId);

// Top listing
List<TopCategory<TopTorrentsResult>> top10torrent = gazlRsrc.top().getTorrents(10);
List<TopCategory<TopTagsResult>> top10tags = gazlRsrc.top().getTags(10);
List<TopCategory<TopUsersResult>> top10users = gazlRsrc.top().getUsers(10);

```

## Comparison with others Gazelle Java implementations

### [Gwindow/WhatAPI](https://github.com/Gwindow/WhatAPI)
- Better coverage of API features
- Include code to access third party services

