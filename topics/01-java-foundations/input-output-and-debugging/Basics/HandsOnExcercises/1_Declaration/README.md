# Primitives vs Reference Types vs Wrapper Classes

## 1. Primitive Types
- Store the **actual value** directly in a fixed-size memory slot (usually the stack).
- Always have a value — **can never be null**.
- Hold exactly **one value** — no built-in way to represent a collection.
- No methods attached — just raw data.
- Compared **by value** (`5 == 5` → true).
- Copying = full independent copy (changing one copy never affects another).
- Fast, lightweight, minimal overhead.

## 2. Reference Types
- Store an **address (pointer)** to where the actual data lives (usually the heap) — not the data itself.
- The variable is like a "sticky note with directions," not the item itself.
- Can be **null** (the pointer can point to nothing).
- Can hold **variable-sized/structured data** (arrays, objects, collections).
- Can have **methods/behavior** attached.
- Compared **by identity** by default (same memory location), but can define custom `.equals()` logic.
- Copying = copies the pointer, **not** the data → multiple variables can share/mutate the same underlying object (aliasing).
- Support **inheritance, polymorphism, and generics**.
- Cost more memory (pointer + object header + data) and are generally slower to access (must "follow" the pointer).

## 3. Why This Design Exists
- Primitives fit neatly into fixed-size memory slots → cheap and fast.
- Objects/arrays are variable in size → can't fit directly into a fixed slot, so a pointer is stored instead, keeping copying/passing cheap even for huge data structures.

## 4. Wrapper Classes (e.g., `int` → `Integer`)
- A wrapper class **wraps a primitive inside an object**, converting it from a primitive into a reference type.
- This "unlocks" all reference-type privileges for that value: nullability, use in collections, use with generics, and access to helper methods (`Integer.parseInt()`, `.compareTo()`, etc.).
- Autoboxing/unboxing happens automatically in languages like Java, but repeated boxing (e.g., in tight loops) creates real performance overhead.

## 5. When to Use Which

| Need | Use |
|---|---|
| Fast math, simple counters, performance-critical loops | Primitive |
| Nullable values (optional/missing data) | Wrapper (reference) |
| Storing values in Lists/Maps/Sets | Wrapper (reference) |
| Generics (`Box<T>`) | Wrapper (reference) |
| Extra methods/utility functions | Wrapper (reference) |

## Key Takeaway

It's not that wrapper classes are "more advanced" or "corporate-grade" while primitives are "basic." Both are used heavily in real production code — the right choice depends entirely on whether the situation needs raw speed/simplicity (primitive) or object-like capabilities such as nullability, collections, or generics (reference/wrapper). Overusing wrappers where unnecessary is actually considered a performance mistake.