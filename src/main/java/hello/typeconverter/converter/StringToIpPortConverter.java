package hello.typeconverter.converter;

import hello.typeconverter.type.IpPort;
import org.springframework.core.convert.converter.Converter;

public class StringToIpPortConverter implements Converter<String,IpPort> {
    //127.0.0.1:8080
    @Override
    public IpPort convert(String source) {
        String[] splitSource = source.split(":");
        String ip = splitSource[0];
        int port = Integer.parseInt(splitSource[1]);
        return new IpPort(ip,port);
    }


}
