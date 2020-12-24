package repl.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Arrays;
import java.util.List;


@ConfigurationProperties(prefix = "clojure.nrepl")
public class StarterServiceProperties {
    private boolean state = true;
    private Integer port = 18848;
    private String bind = "localhost";
    private List<String> mode = Arrays.asList("dev","test");


    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public boolean getState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public List<String> getMode() {
        return mode;
    }

    public void setMode(List<String> mode) {
        this.mode = mode;
    }

    @Override
    public String toString() {
        return "StarterServiceProperties{" + "state=" + state + ", port=" + port + ", mode=" + mode + ", bind=" + bind + '}';
    }

    public String getBind() {
        return bind;
    }

    public void setBind(String bind) {
        this.bind = bind;
    }
}