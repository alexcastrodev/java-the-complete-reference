javac packagea/ClassA.java packageb/ClassB.java -d package_out

# Wildcard
javac packagea/* packageb/* -d package_out_wildcard

java -cp package_out packagea/ClassA
java -cp package_out packageb/ClassB

java -cp package_out_wildcard packagea/ClassA
java -cp package_out_wildcard packageb/ClassB
