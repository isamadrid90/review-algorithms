package isamadrid90.binary_tree.traversals

import isamadrid90.binary_tree.Node
import isamadrid90.binary_tree.Tree
import kotlin.test.assertEquals
import org.junit.jupiter.api.Test

class PostorderTraversalTest {

    @Test
    fun `should return a correct list with one leaf`() {
        val tree = Tree(Node(2, null, null))

        val result = PostorderTraversal().execute(tree)

        assertEquals(listOf(2), result)
    }

    @Test
    fun `should return a correct list with one left child`() {
        val tree = Tree(
            Node(
                value = 2,
                left = Node(
                    value = 1,
                    left = null,
                    right = null
                ),
                right = null
            )
        )

        val result = PostorderTraversal().execute(tree)

        assertEquals(listOf(1, 2), result)
    }

    @Test
    fun `should return a correct list with both children`() {
        val tree = Tree(
            Node(
                value = 2,
                left = Node(
                    value = 1,
                    left = null,
                    right = null
                ),
                right = Node(
                    value = 3,
                    left = null,
                    right = null
                )
            )
        )

        val result = PostorderTraversal().execute(tree)

        assertEquals(listOf(1, 3, 2), result)
    }

    @Test
    fun `should return a correct list with two deep`() {
        val tree = Tree(
            Node(
                value = 1,
                left = Node(
                    value = 2,
                    left = Node(4, null, null),
                    right = Node(5, null, null)
                ),
                right = Node(3, null, null)
            )
        )

        val result = PostorderTraversal().execute(tree)

        assertEquals(listOf(4, 5, 2, 3, 1), result)
    }
}
