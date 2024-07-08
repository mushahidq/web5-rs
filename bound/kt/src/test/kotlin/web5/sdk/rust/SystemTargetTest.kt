package web5.sdk.rust

import org.junit.jupiter.api.Test

class SystemTargetTest {
    @Test
    fun `can load shared library`() {
        System.setProperty("WEB5_SDK_LOG_LEVEL", "debug")
        SystemTarget.set()
        UniffiLib.INSTANCE
        println("Successfully loaded shared library for ${System.getProperty("uniffi.component.web5.libraryOverride")}")
    }
}