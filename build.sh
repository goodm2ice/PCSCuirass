dep_dir="./libs"
build_dir="./build"
output="./test_server/plugins/PCSCuirass.jar"

# Generating .class files
deps=$(find $dep_dir -name '*.jar' | paste -s -d';')
find -name '*.java' | xargs javac -cp $deps -d $build_dir
cp ./plugin.yml $build_dir/
# Generating .jar build
jar -cf $output -C $build_dir .
# Clean
rm -rf $build_dir