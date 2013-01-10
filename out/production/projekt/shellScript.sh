clear
echo ""######################## Starting Shell Script "########################"
echo "# Compiling all *.java Files..."
javac *.java
echo "# Preparing directory..."
mkdir tests
cp testCases/1.pas tests/
cp testCases/2.pas tests/
cp testCases/3.pas tests/
cp testCases/4.pas tests/
cp testCases/5.pas tests/
cp testCases/6.pas tests/
cp testCases/7.pas tests/
cp testCases/8.pas tests/
echo "######################## Test 1 ########################"
echo "# Calling StupsCompiler..."
java StupsCompiler -compile tests/1.pas
echo "# Calling jasmin.jar..."
java -jar jasmin.jar tests/1.j
echo "# Executing Java File..."
java tests/1
echo "# Done."
echo "######################## Test 2 ########################"
echo "# Calling StupsCompiler..."
java StupsCompiler -compile tests/2.pas
echo "# Calling jasmin.jar..."
java -jar jasmin.jar tests/2.j
echo "# Executing Java File..."
java tests/2
echo "# Done."
echo "######################## Test 3 ########################"
echo "# Calling StupsCompiler..."
java StupsCompiler -compile tests/3.pas
echo "# Calling jasmin.jar..."
java -jar jasmin.jar tests/3.j
echo "# Executing Java File..."
java tests/3
echo "# Done."
echo "######################## Test 4 ########################"
echo "# Calling StupsCompiler..."
java StupsCompiler -compile tests/4.pas
echo "# Calling jasmin.jar..."
java -jar jasmin.jar tests/4.j
echo "# Executing Java File..."
java tests/4
echo "# Done."
echo "######################## Test 5 ########################"
echo "# Calling StupsCompiler..."
java StupsCompiler -compile tests/5.pas
echo "# Calling jasmin.jar..."
java -jar jasmin.jar tests/5.j
echo "# Executing Java File..."
java tests/5
echo "# Done."
echo "######################## Test 6 ########################"
echo "# Calling StupsCompiler..."
java StupsCompiler -compile tests/6.pas
echo "# Calling jasmin.jar..."
java -jar jasmin.jar tests/6.j
echo "# Executing Java File..."
java tests/6
echo "# Done."
echo "######################## Test 7 ########################"
echo "# Calling StupsCompiler..."
java StupsCompiler -compile tests/7.pas
echo "# Calling jasmin.jar..."
java -jar jasmin.jar tests/7.j
echo "# Executing Java File..."
java tests/7
echo "# Done."
echo "######################## Test 8 ########################"
echo "# Calling StupsCompiler..."
java StupsCompiler -compile tests/8.pas
echo "# Calling jasmin.jar..."
java -jar jasmin.jar tests/8.j
echo "# Executing Java File..."
java tests/8
echo "# Done."