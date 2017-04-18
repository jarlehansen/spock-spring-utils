# spock-spring-utils

**MockMvcSpecification**

Simplifies the setup required to create `MockMvc` tests with [spock](http://spockframework.org/).

```groovy
class TestControllerSpec extends MockMvcSpecification {
    private TestController controller
    private MockMvc mockMvc

    void setup() {
        controller = new TestController()
        mockMvc = MockMvcBuilders.standaloneSetup(controller).build()
    }

    def "Return status 200 OK"() {
        when:
        def response = mockMvc.perform(get('/test'))

        then:
        response.andExpect(status().isOk())
    }
}
```