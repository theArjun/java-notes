# Color Control

> Color constants and their RGB values

| Constant | RGB Value|  
|--------|---------|  
| ```public static final Color RED``` | 255,0,0 |
| ```public static final Color GREEN``` | 0,255,0 |
| ```public static final Color BLUE``` | 0,0,255 |
| ```public static final Color ORANGE``` | 255,200,0 |
| ```public static final Color PINK``` | 255,75,175 |
| ```public static final Color CYAN``` | 0,255,255 |
| ```public static final Color MAGNETA``` | 255,0,255 |
| ```public static final Color YELLOW``` | 255,255,0 |
| ```public static final Color BLACK``` | 0,0,0 |
| ```public static final Color WHITE``` | 255,255,255 |
| ```public static final Color GRAY``` | 128,128,128 |
| ```public static final Color LIGHT_GRAY``` | 192,192,192 |
| ```public static final Color DARK_GRAY``` | 64,64,64 |

## Constructors

1. ```public Color(int r, int g, int b)``` 
> based on RGB values 0-255
2. ```public color(float r, float g, float b)``` 
 > based on 0.0 to 1.0

## Methods
1. ```public int getRed()```
2. ```public int getGreen()```
3. ```public int getBlue()```

### Graphics method for manipulating Colors
1. ```public int getColor()```
- returns object representing current color for the graphics context.

2. ```public int setColor(Color c)```
- Sets current color for drawing with the graphics context.

