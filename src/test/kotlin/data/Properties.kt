package data

import io.opengood.autoconfig.openapidocs.OpenApiDocsProperties
import io.opengood.autoconfig.openapidocs.OpenApiDocsProperties.Contact
import io.opengood.autoconfig.openapidocs.OpenApiDocsProperties.License
import io.opengood.autoconfig.openapidocs.OpenApiDocsProperties.Security
import io.opengood.autoconfig.openapidocs.OpenApiDocsProperties.Security.BearerFormat
import io.opengood.autoconfig.openapidocs.OpenApiDocsProperties.Security.Oauth2
import io.opengood.autoconfig.openapidocs.OpenApiDocsProperties.Security.Oauth2.Client
import io.opengood.autoconfig.openapidocs.OpenApiDocsProperties.Security.Oauth2.GrantType
import io.opengood.autoconfig.openapidocs.OpenApiDocsProperties.Security.Oauth2.Resource
import io.opengood.autoconfig.openapidocs.OpenApiDocsProperties.Security.Scheme
import io.opengood.autoconfig.openapidocs.OpenApiDocsProperties.Security.Type

val openApiDocsProperties = OpenApiDocsProperties(
    enabled = true,
    paths = listOf("/greeting/**"),
    title = "test title",
    description = "test description",
    version = "test version",
    termsOfService = "https://test.tos.url",
    contact = Contact(
        name = "test contact name",
        url = "https://test.contact.url",
        email = "test@domain.com"
    ),
    license = License(
        name = "test license name",
        url = "https://test.lic.url"
    ),
    security = Security(
        enabled = true,
        name = "test security",
        description = "test security description",
        scheme = Scheme.BEARER,
        type = Type.HTTP,
        bearerFormat = BearerFormat.JWT,
        oauth2 = Oauth2(
            grantType = GrantType.CLIENT_CREDENTIALS,
            resource = Resource(
                authorizationServerUri = "http://localhost/oauth2/authorize"
            ),
            client = Client(
                scopes = mapOf(
                    Pair("test-1", "test-scope-1"),
                    Pair("test-2", "test-scope-2")
                )
            ),
            tokenUri = "http://localhost/oauth2/token"
        )
    )
)
