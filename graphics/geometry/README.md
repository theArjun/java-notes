# Geometrical Elements

## Line
- ```public void drawLine(int x1, int y1, int x2, int y2);```

## Rectangle
- ```public void drawRect(int x, int y, int width, int height);```
- ```public void fillRect(int x, int y,  int width, int height);```
- ```public void drawRoundRect(int x, int y, int width, int height, int arcWidth, int arcHeight);```
- ```public void fillRoundRect(int x, int y, int width, int height, int arcWidth, int arcHeight);```
- 
## Oval
- ```public void drawOval(int x, int y, int width, int height);```
- ```public void fillOval(int x, int y, int width, int height);```

## Arc
- ```public void drawArc(int x, int y, int width, int height, int startAngle, int arcAngle);```
- ```public void fillArc(int x, int y, int width, int height, int startAngle, int arcAngle);```

> Negative angle means rotating clockwise, positive means anti-clockwise.

## Drawing Polygons and Polylines

- Polygons are closed multisided shapes composed of straight line segments.
- Polylines are sequences of connected points.

### Polygon Constructors
- ```public Polygon()```
- ```public Polygon(int[] xValues, int[] yValues , int numberOfPoint)```
- 
### Methods
- ```public void addPoint(int x, int y)```
