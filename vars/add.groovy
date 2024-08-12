def call(X, Y) {
    X = (X != null) ? X as Integer : 0
    Y = (Y != null) ? Y as Integer : 0
    echo "Sum of ${X} and ${Y} is ${X + Y}"
}
