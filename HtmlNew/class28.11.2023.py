class Array:
    def __init__(self, n=5):
        self.len=n
        self.arr=[]

    def get_num(self):
        for i in range(self.len):
            self.arr.append(int(input("Enter the number in array")))
    
    def merge(obj1,obj2):
        obj3=Array()
        obj3.arr.extend(obj1.arr)
        obj3.arr.extend(obj2.arr)
        obj3.arr.sort()
        return obj3

obj1= Array(5)
obj1.get_num()

obj2= Array(5)
obj2.get_num()

obj3=obj1.merge(obj2)

print(obj1.arr)
print(obj2.arr)
print(obj3.arr)












    