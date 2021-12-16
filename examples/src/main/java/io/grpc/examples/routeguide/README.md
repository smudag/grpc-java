cd /root/grpc-java/examples
./gradlew installDist


/root/grpc-java/examples/build/install/examples/bin/hello-world-server
/root/grpc-java/examples/build/install/examples/bin/route-guide-server


grep --include \*.json -rnw '/root/grpc-java/examples/' -e 'Singapore'


grep --include \*.proto -rnw '/root/grpc-java/examples/src'   -e 'RouteNote' 

