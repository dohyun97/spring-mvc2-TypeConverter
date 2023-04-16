package hello.typeconverter;

import hello.typeconverter.converter.IntegerToStringConverter;
import hello.typeconverter.converter.IpPortToStringConverter;
import hello.typeconverter.converter.StringToIntegerConverter;
import hello.typeconverter.converter.StringToIpPortConverter;
import hello.typeconverter.formatter.MyNumberFormatter;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addFormatters(FormatterRegistry registry) {
        //MyNumberFormatter랑 기능이 겹쳐. 우선순위는 컨버터가 먼저여서 주석처리
//        registry.addConverter(new IntegerToStringConverter());
//        registry.addConverter(new StringToIntegerConverter());

        registry.addConverter(new IpPortToStringConverter());
        registry.addConverter(new StringToIpPortConverter());
        registry.addFormatter(new MyNumberFormatter());
    }
}
