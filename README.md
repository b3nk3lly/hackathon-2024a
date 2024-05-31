Requirements:

-   JDK 21+
-   Maven 3.8+

Installing & Running everything

OpenTelemetry Collector Contrib

-   Download the OpenTelemetry Collector Contrib executable from: https://github.com/open-telemetry/opentelemetry-collector-releases/releases/download/v0.101.0/otelcol-contrib_0.101.0_windows_amd64.tar.gz.sig
-   Extract into `otelcol/`
-   Run `otelcol-contrib.bat`

Prometheus

-   Download Prometheus from: https://github.com/prometheus/prometheus/releases/download/v2.52.0/prometheus-2.52.0.windows-amd64.zip
-   Extract into `prometheus/`
-   Do not overwrite `prometheus.yml` !
-   Run `prometheus.bat`

Loki

-   Download Loki executable from: https://github.com/grafana/loki/releases/download/v2.9.8/loki-windows-amd64.exe.zip
-   Extract into `loki/`
-   Do not overwrite `loki.yml` !
-   Run `loki.bat`

Sample App

-   `cd` into the folder `demo-app/`
-   Install with `mvn install`
-   Run the following command:

```
java -javaagent:lib/opentelemetry-javaagent.jar -Dotel.javaagent.configuration-file=src/main/resources/otel.yml -jar target/hackathon-0.0.1-SNAPSHOT.jar --debug
```