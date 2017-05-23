package com.cwt

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import springfox.documentation.builders.ApiInfoBuilder
import springfox.documentation.builders.PathSelectors
import springfox.documentation.service.ApiInfo
import springfox.documentation.service.Contact
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket
import springfox.documentation.swagger2.annotations.EnableSwagger2

/**
 * Spring Boot and Swagger 2 setup.  Spring + Kotlin integration requires using open classes and functions
 */
@SpringBootApplication
@EnableSwagger2
open class CwtApp {


    private fun apiInfo(): ApiInfo {
        return ApiInfoBuilder()
                .title("Simple CWT App")
                .description("Java application with integration with Kotlin, Lambda, and Spring Boot")
                .termsOfServiceUrl("http://www.carlsonwagonlit.com/content/cwt/global/en/legal/terms-of-use.html")
                .contact(Contact("Brian Cowan", "", "Brian.Cowan@carlsonwagonlit.com"))
                .version("1.0")
                .build()
    }

}

fun main(args: Array<String>) {
    SpringApplication.run(CwtApp::class.java, *args)
}

