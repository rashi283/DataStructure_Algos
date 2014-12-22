def main():
    str1 = "foo"
    str2 = "app"
    func(str1, str2)

def func(str1, str2):
    uni1 = ""
    uni2 = ""

    if len(str1) == len(str2):
        for i in str1:
           if i not in uni1: 
               uni1 = uni1 + i
        
        for j in str2:
            if j not in uni2:
                uni2 = uni2 + j
        
        print uni1
        print uni2
    
        if len(uni1) == len(uni2):
            print "isomorphic"
        else:
            print "not isomorphic"
    else:
        print "not isomorphic"

main()
