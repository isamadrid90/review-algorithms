package isamadrid90.binary_tree

data class Tree<T>(val root: Node<T>)
data class Node<T>(val value: T, val left: Node<T>?, val right: Node<T>?)
