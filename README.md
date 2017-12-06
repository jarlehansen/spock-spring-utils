# spock-spring-utils

## Installation
```groovy
testCompile('com.github.spock.spring.utils:spock-spring-utils:1.0.0')
```

## MockMvcSpecification

Simplifies the setup required to create `MockMvc` tests with [spock](http://spockframework.org/).

```groovy
class TestControllerSpec extends MockMvcSpecification {
    private TestController controller
    private MockMvc mockMvc

    void setup() {
        controller = new TestController()
        mockMvc = standaloneSetup(controller)
    }

    def "Return status 200 OK"() {
        when:
        def response = mockMvc.perform(get('/test'))

        then:
        response.andExpect(status().isOk())
                .andExpect(jsonPathSize('$', 1))
                .andExpect(jsonPathEquals('$[0].test', '123'))
    }
}
```