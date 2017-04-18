package com.github.spock.spring.utils

import org.hamcrest.Matcher
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.ResultMatcher
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.ContentResultMatchers
import org.springframework.test.web.servlet.result.JsonPathResultMatchers
import org.springframework.test.web.servlet.result.MockMvcResultMatchers
import org.springframework.test.web.servlet.result.StatusResultMatchers
import org.springframework.test.web.servlet.setup.MockMvcBuilders
import org.springframework.web.context.WebApplicationContext
import spock.lang.Specification

class MockMvcSpecification extends Specification {

    static MockMvc standaloneSetup(Object... controllers) {
        return MockMvcBuilders.standaloneSetup(controllers).build()
    }

    static MockMvc webAppContextSetup(WebApplicationContext context) {
        return MockMvcBuilders.webAppContextSetup(context).build()
    }

    static MockHttpServletRequestBuilder get(String urlTemplate, Object... uriVars) {
        return MockMvcRequestBuilders.get(urlTemplate, uriVars)
    }

    static MockHttpServletRequestBuilder get(URI uri) {
        return MockMvcRequestBuilders.get(uri)
    }

    static MockHttpServletRequestBuilder post(String urlTemplate, Object... uriVars) {
        return MockMvcRequestBuilders.post(urlTemplate, uriVars)
    }

    static MockHttpServletRequestBuilder post(URI uri) {
        return MockMvcRequestBuilders.post(uri)
    }

    static MockHttpServletRequestBuilder put(String urlTemplate, Object... uriVars) {
        return MockMvcRequestBuilders.put(urlTemplate, uriVars)
    }

    static MockHttpServletRequestBuilder put(URI uri) {
        return MockMvcRequestBuilders.put(uri)
    }

    static MockHttpServletRequestBuilder patch(String urlTemplate, Object... uriVars) {
        return MockMvcRequestBuilders.patch(urlTemplate, uriVars)
    }

    static MockHttpServletRequestBuilder patch(URI uri) {
        return MockMvcRequestBuilders.patch(uri)
    }

    static MockHttpServletRequestBuilder delete(String urlTemplate, Object... uriVars) {
        return MockMvcRequestBuilders.delete(urlTemplate, uriVars)
    }

    static MockHttpServletRequestBuilder delete(URI uri) {
        return MockMvcRequestBuilders.delete(uri)
    }

    static MockHttpServletRequestBuilder options(String urlTemplate, Object... uriVars) {
        return MockMvcRequestBuilders.options(urlTemplate, uriVars)
    }

    static MockHttpServletRequestBuilder options(URI uri) {
        return MockMvcRequestBuilders.options(uri)
    }

    static MockHttpServletRequestBuilder head(String urlTemplate, Object... uriVars) {
        return MockMvcRequestBuilders.head(urlTemplate, uriVars)
    }

    static MockHttpServletRequestBuilder head(URI uri) {
        return MockMvcRequestBuilders.head(uri)
    }

    static StatusResultMatchers status() {
        return MockMvcResultMatchers.status()
    }

    static ContentResultMatchers content() {
        return MockMvcResultMatchers.content()
    }

    static JsonPathResultMatchers jsonPath(String expression, Object... args) {
        return MockMvcResultMatchers.jsonPath(expression, args)
    }

    static <T> ResultMatcher jsonPath(String expression, Matcher<T> matcher) {
        return MockMvcResultMatchers.jsonPath(expression, matcher)
    }

}
