## Layered Pan in java

This Java program demonstrates the use of `JLayeredPane` in Swing to create layered layouts where components overlap each other. The program features a `JLayeredPane` containing four `JLabel` components with distinct colors and positions, showcasing how layering works in Java Swing.

The application is a great example for beginners learning about layered panes and how to control the depth and appearance of components in a graphical user interface.

-------------

## Features

- Layered Pane: Utilizes `JLayeredPane` to stack multiple components (`JLabels`) on top of each other.

- Colorful Labels: Demonstrates overlapping rectangles with distinct background colors (blue, green, red, yellow).

- Customizable Bounds: The position and size of each label are defined using `setBounds`.

- Transparent and Opaque Elements: The labels are set to be opaque, allowing their colors to be fully visible.

----------------

## Requirements

Java Version: Java 17 or higher (for compatibility with modern Java features).

------------------

## Customization

1. Modify Layering: To explicitly define the order of layers, use the `add` method with a depth argument:
   
```bash
pane.add(label1, Integer.valueOf(1)); // Label1 at depth 1
pane.add(label2, Integer.valueOf(2)); // Label2 at depth 2
pane.add(label3, Integer.valueOf(3)); // Label3 at depth 3
pane.add(label4, Integer.valueOf(4)); // Label4 at depth 4
```

2. Change Label Colors: Adjust the `setBackground` calls to use custom colors:

```bash
label1.setBackground(Color.CYAN);
label2.setBackground(new Color(123, 234, 111));
```

3. Resize the Layered Pane: Modify the pane dimensions to fit your requirements:
```bash
pane.setBounds(0, 0, 600, 600);
```

4. Add More Components: You can add additional labels or Swing components to the `JLayeredPane`.

--------------

## Example Output

When you run the program:

- A window appears with a 600x600 frame.
- Four overlapping rectangles (blue, green, red, yellow) are displayed, stacked on top of one another in increasing depth.

-----------------

## Code Highlights

- `JLayeredPane`: Used to stack components at different depths.
- Bounds and Positioning: Each label's position is defined using setBounds.
- Overlapping Components: Labels overlap to demonstrate visual layering.

-----------------------------------
