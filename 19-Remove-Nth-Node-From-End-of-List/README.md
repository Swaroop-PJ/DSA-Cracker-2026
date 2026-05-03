# [19] Remove Nth Node From End of List
**Difficulty:** Medium | **Topics:** Linked List, Two Pointers

## 📊 Performance Metrics
* **Runtime:** 0 ms (Beats 100.00%)
* **Memory:** 41.8 MB (Beats 72.40%)

## 🛠️ Complexity Analysis
* **Time Complexity:** $O(L)$
  * We traverse the list exactly once. $L$ is the number of nodes in the list.
* **Space Complexity:** $O(1)$
  * No extra space is used regardless of the size of the input list.

## 📝 Problem Logic & Notes
To solve this "manually" in a single pass:
1. **The Fast Pointer:** Move a `fast` pointer $n$ steps ahead.
2. **The Gap:** Once the `fast` pointer is $n$ steps ahead, move both `fast` and `slow` pointers together until `fast` reaches the end.
3. **The Target:** The `slow` pointer will now be exactly behind the node that needs to be removed.
4. **The Dummy Node:** Used a `dummy` node at the start to handle edge cases, like when the head itself needs to be removed.
