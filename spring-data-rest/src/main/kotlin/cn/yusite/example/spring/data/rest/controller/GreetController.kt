package cn.yusite.example.spring.data.rest.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.nio.charset.Charset
import javax.servlet.http.HttpServletRequest

@RestController
class GreetController {

    @RequestMapping("hi")
    fun hi(request: HttpServletRequest): String {

        var bufferedReader = request.inputStream.bufferedReader(Charset.forName("utf-8"))
        var readText = bufferedReader.readText()
        println(readText)
        return "Greet";
    }
}