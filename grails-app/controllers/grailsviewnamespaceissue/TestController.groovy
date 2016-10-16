package grailsviewnamespaceissue

class TestController {

    static namespace = "xyz"

    def testView() {
        render(view: "testView")
    }

    def testViewPriority() {
        render(view: "testViewPriority")
    }

    def testJsonA() {
        render (view: "testJson", model: [text: "This is a test message"])
    }

    def testJsonB() {
        render (view: "/xyz/test/testJson", model: [text: "This is a test message"])
    }
}
