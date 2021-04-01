![Plaid Logo](https://plaid.com/assets/img/navbar/logo.svg)
<br>
<a href="https://twitter.com/ruffCode" target="_blank">
<img alt="Twitter: ruffCode" src="https://img.shields.io/twitter/follow/ruffCode.svg?style=social" />
</a>
[![Maven Central](https://img.shields.io/maven-central/v/tech.alexib/plaid-kotlin.svg?label=Maven%20Central)](https://search.maven.org/search?q=g:%22tech.alexib%22%20AND%20a:%22plaid-kotlin%22)

# Plaid-Kotlin
#### Kotlin bindings for Plaid
Fully asynchronous - uses Ktor Apache under the hood
### Official API Documentation <a href="https://plaid.com/docs/" target="_blank">https://plaid.com/docs </a>

### Installation 
```kotlin
repositories {
    mavenCentral()
}

dependencies {
    implementation("tech.alexib:plaid-kotlin:0.0.21")
}
```
Or to use a snapshot build
```kotlin
repositories{
    //...
    maven("https://jitpack.io")
}

dependencies{
    implementation("com.github.ruffCode:plaid-kotlin:-SNAPSHOT")
}
```
### Configuration

```kotlin
   val plaidApiConfiguration = PlaidApiConfiguration(
        ClientId(plaidConfig.clientId),
        Secret(plaidConfig.secret),
        baseUrl = BaseUrl.Sandbox, //defaults to sandbox
        plaidVersion = PlaidVersion("2020-09-14") //defaults to latest
    )
    
    val plaidClient = PlaidClient(plaidApiConfiguration)
```

### Basic Usage
```kotlin
suspend fun getItem(): Item {

    val request: SandboxPublicTokenCreateRequest =
        SandboxPublicTokenCreateRequest(
            institutionId = "ins_109511",
            initialProducts = listOf(Products.TRANSACTIONS)
        )

    val createResponse: SandboxPublicTokenCreateResponse =
        plaidClient.sandboxPublicTokenCreate(request)

    val itemPublicTokenExchangeRequest =
        ItemPublicTokenExchangeRequest(publicToken = createResponse.publicToken)

    val response: ItemPublicTokenExchangeResponse = plaidClient
        .itemPublicTokenExchange(itemPublicTokenExchangeRequest)

    val itemGetRequest = ItemGetRequest(accessToken = response.accessToken)

    val itemGetResponse: ItemGetResponse = plaidClient
        .itemGet(itemGetRequest)

    return itemGetResponse.item
}
 
```
## TODO

- [X] Publish to MavenCentral
- [ ] Documentation
- [ ] Tests & CodeCov
- [ ] Automate deploy

## 📝 License

```
Copyright © 2021 - Alexi Bre

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
